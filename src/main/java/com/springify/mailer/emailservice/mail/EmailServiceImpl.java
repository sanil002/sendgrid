package com.springify.mailer.emailservice.mail;

import java.io.IOException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

@Service
public class EmailServiceImpl implements EmailService{
	
	@Value( "${sendgrid.apikey}" )
	private String sendGridApiKey;

	@Override
	public void sendSimpleMessage(Email from, String subject, Email to, Content content) throws IOException{
		Mail mail= new Mail(from, subject, to, content);
		
		SendGrid sg=new SendGrid(new String (Base64.getDecoder().decode(sendGridApiKey)));
		Request req=new Request();
		
		try {
			req.setMethod(Method.POST);
			req.setEndpoint("mail/send");
			req.setBody(mail.build());
			
			Response res=sg.api(req);
			
			System.out.println(res.getStatusCode());
			System.out.println(res.getBody());
			System.out.println(res.getHeaders());
			
		}catch(Exception e)
		{
			throw e;
		}
	}

	
}
