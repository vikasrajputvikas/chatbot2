package com.crm.qa.base;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class DemoEmail {

	public static void main(String[] args) throws EmailException {
		// TODO Auto-generated method stub
		System.out.println("start");
		Email email = new SimpleEmail();
		email.setHostName("vikasrajput9719@gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("selenium3bymukesh@gmail.com", "Demo@12345"));
		email.setSSLOnConnect(true);
		email.setFrom("vikaskumar@appypiellp.com");
		email.setSubject("selenium   TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("rajputvikas9719@gmail.com");
		email.send();
		System.out.println("end");

	}

}
