package com.springify.mailer.emailservice.mail;

import java.io.IOException;

import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

/**
 * 
 * @author Sanil
 *
 */
public interface EmailService {
	void sendSimpleMessage(Email from, String subject, Email to, Content content) throws IOException;
}
