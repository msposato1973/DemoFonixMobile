package com.fonix.demo.service.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fonix.demo.Entity.Users;
import com.fonix.demo.model.FrequenciesItem;
import com.fonix.demo.repository.UserRepository;
import com.fonix.demo.service.UserService;
import com.fonix.demo.utility.UtilityDate;

@Service
public class UserServiceImpl implements UserService{
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void save(List<FrequenciesItem> list,String emailAddress) {
		List<Users> entities = new ArrayList<>();
		
		try {
			Users user = null;
			for (FrequenciesItem item: list) {
				user = new Users();
				user.setEmailAddress(emailAddress);
				user.setDestination(item.getDestination());
				user.setFlightDate(UtilityDate.getDateFromString(item.getFlightDate()));
				user.setFlightNumber(item.getFlightNumber());
				user.setOrigin(item.getOrigin());
				user.setPrice(item.getPrice());;
				
				entities.add(user);
			}
		
		userRepository.saveAll(entities);
		
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 
	}

	@Override
	public List<FrequenciesItem> getListFlightByEmail() {
		List<FrequenciesItem> listItem =new ArrayList<>() ;
		List<Users> list = (List<Users>) userRepository.findAll();
		FrequenciesItem alloweBean = null;
		for(Users us:list) {
			alloweBean = new FrequenciesItem();
			alloweBean.setDestination(us.getDestination());
			alloweBean.setOrigin(us.getOrigin());
			alloweBean.setFlightDate(""+us.getFlightDate());
			alloweBean.setFlightNumber(us.getFlightNumber());
			listItem.add(alloweBean);
		}
		
		return listItem;
	}

	 

	 

}
