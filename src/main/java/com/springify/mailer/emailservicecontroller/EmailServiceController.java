package com.springify.mailer.emailservicecontroller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import com.springify.mailer.emailservice.mail.EmailService;
import com.springify.mailer.model.EmailDetails;

@RestController
@RequestMapping("/notify")
public class EmailServiceController {

	@Autowired
	private EmailService emailService;
	
	
	@PostMapping(path="/email")
	public String sendEmail(@RequestBody EmailDetails emailDetail) throws IOException
	{
		/*Email from = new Email("sanil.shinde404@gmail.com");
	    String subject = "Welcome Email...";
	    Email to = new Email("sanil.shinde.200@gmail.com");
	    Content content = new Content("text/plain", "Welcoming you to Email service...");
	    */
		Email from = emailDetail.getFrom();
	    String subject = emailDetail.getSubject();
	    Email to = emailDetail.getTo();
	    Content content = emailDetail.getContent();
	    
		emailService.sendSimpleMessage(from, subject, to, content);
		return "SUCCESS";
	}
}
