package com.fonix.demo.service;

import javax.mail.MessagingException;

import com.fonix.demo.utility.HtmlMail;
import com.fonix.demo.utility.SimpleMail;

public interface MailService {
	 String sendMail(String addressTo,String subject,String messege) ;
	 void sendSimpleMail(SimpleMail mail) ;
	 void sendHTMLMail(HtmlMail mail) throws MessagingException;
	 String sendMailAttachment(String addressTo, String textMsg, String fromTo) throws MessagingException;
}
