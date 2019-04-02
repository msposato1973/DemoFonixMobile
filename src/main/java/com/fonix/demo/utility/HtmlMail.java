package com.fonix.demo.utility;

import java.util.List;

public class HtmlMail {

	private  String to;
	private  String subject;

    public HtmlMail() {
    }
    
    public HtmlMail(String to) {
        this.to = to;
    }
    
    public HtmlMail(String to, String subject) {
        this.to = to;
        this.subject = subject;
    }

    public String getTo() {
        return this.to;
    }
    public String getSubject() {
    	return this.subject;
    }

   
    public String getContent() {
        return "<html>" +
                    "<body>" +
                        "<p>Hello,<strong>" +  this.subject + "</strong></p>" +
                        "<p>This an <strong>HTML</strong> email content !</p>" +
                        "<p><a href ='"+this.to+"' ><strong>CONFIRM EMAIL</strong></a></p>" +
                    "</body>" +
                "</html>";
    }
    
    public String getContent(String name, String surname) {
        return "<html>" +
                    "<body>" +
                        "<p>Hello,<strong>" + name +" "+ surname + "</strong></p>" +
                        "<p>This an <strong>HTML</strong> email content !</p>" +
                        "<p><a href ='"+this.to+"' ><strong>CONFIRM EMAIL</strong></a></p>" +
                    "</body>" +
                "</html>";
    }
    
    public String getContent(String mailTo, List<String> mailText) {
    	StringBuffer sb=new StringBuffer();
    	for(String rowmail:mailText) {
    		sb.append( "<p>Hello,<strong>" + rowmail + "</strong></p>");
    	}
    	
    	
        return "<html>" +
                    "<body>" +
                        "<p>Hello,<strong>" + mailTo + "</strong></p>" +
                        sb.toString() +
                        "<p>This an <strong>HTML</strong> email content !</p>" +
                        "<p><a href ='"+this.to+"' ><strong>CONFIRM EMAIL</strong></a></p>" +
                    "</body>" +
                "</html>";
    }
}