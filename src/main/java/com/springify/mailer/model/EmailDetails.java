package com.springify.mailer.model;

import java.io.Serializable;

import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

public class EmailDetails implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -52962035539911105L;
	private Email from;
	private String subject;
	private Email to;
	private Content content;
	
	public Email getFrom() {
		return from;
	}
	public void setFrom(Email from) {
		this.from = from;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Email getTo() {
		return to;
	}
	public void setTo(Email to) {
		this.to = to;
	}
	public Content getContent() {
		return content;
	}
	public void setContent(Content content) {
		this.content = content;
	}
}
