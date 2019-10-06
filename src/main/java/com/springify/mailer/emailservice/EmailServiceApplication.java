package com.springify.mailer.emailservice;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.springify"})
public class EmailServiceApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(EmailServiceApplication.class, args);
	}

}
