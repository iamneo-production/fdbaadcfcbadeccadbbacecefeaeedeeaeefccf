package com.example.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestApplication
public class SpringappApplication {
	
	public String Welcome() {
		return "Welcome String Boot!";
	}

}
