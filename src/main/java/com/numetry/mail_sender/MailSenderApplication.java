package com.numetry.mail_sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MailSenderApplication {
	
	@Autowired
	private EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(MailSenderApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {
		senderService.sendEmail("2018bel004@sggs.ac.in", "Spring Boot Application Subject", "This email was sent to you by springboot application created by Vaijnath Kasande");
	}
	

}
