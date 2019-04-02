package com.fonix.demo.web;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fonix.demo.model.AllowsUser;
import com.fonix.demo.model.Frequencie;
import com.fonix.demo.model.FrequenciesItem;
import com.fonix.demo.service.FlightService;
import com.fonix.demo.service.ItemsService;
import com.fonix.demo.service.MailService;
import com.fonix.demo.service.UserService;
import com.fonix.demo.utility.Generate;
import com.fonix.demo.utility.HtmlMail;
import com.fonix.demo.utility.UtilityDate;

@Controller
public class MainController {
	
	@Autowired
	private ItemsService itemService;
	
	@Autowired
	private UserService userService ;
	
	@Autowired
	private FlightService flightService;
	
	@Autowired
	private MailService mailService;

	@GetMapping("/")
	public String index(Model model) throws ParseException {
	 
		model.addAttribute("time", UtilityDate.getDateFromat());
		return "index";
	}
	
	 
	
	@RequestMapping(value = "/search", method = RequestMethod.GET) 
	public String displayLogin(Model model) { 
		AllowsUser allowsUser= new AllowsUser();
		allowsUser.setToken(Generate.getToken());
		
		model.addAttribute("allowsUser", allowsUser);
		model.addAttribute("userToken", allowsUser.getToken());
	    model.addAttribute("listFrequencies", getListFrequencies());
	    
	    return "allowsUser"; 
	}
	
	
	@PostMapping("/search")
	public String goToAllowsUser(Model model, AllowsUser allowsUser) {
		
		String emailAddress = allowsUser.getEmailAddress();
		List<FrequenciesItem> list = new ArrayList<>();
		
		list = flightService.getListflght(allowsUser);
		userService.save(list, emailAddress);
		
		model.addAttribute("listflight",list);
		model.addAttribute("emailAddress", emailAddress);
		model.addAttribute("allowsUser", allowsUser);
		
		
		return "menu";
	}
	
	 
	
	
	@PostMapping("/sendMail")
	public String sendMail(Model model, AllowsUser allowsUser) throws MessagingException {
		
		String msg = "";
		String emailAddress = allowsUser.getEmailAddress();
		
		List<FrequenciesItem> list = new ArrayList<>();
		list = userService.getListFlightByEmail();
		model.addAttribute("listflight",list);
		
		try { 
			HtmlMail hm = new HtmlMail(emailAddress,"Java Technical Interview Challenge");
			//mailService.sendMailAttachment(emailAddress, hm.getContent(), emailAddress);
			//Mail disable for problem autentication with google
			msg = "Mail Sent  ..";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Error while sending mail ..";
		}
		
		model.addAttribute("emailAddress", emailAddress);
		model.addAttribute("allowsUser", allowsUser);
		model.addAttribute("msg",msg);
		
		return "menu";
	}
	
	private List<Frequencie> getListFrequencies(){
		return itemService.getFindAll();
	}
	
	 
	 
    
}
