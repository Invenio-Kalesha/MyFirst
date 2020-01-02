package com.rmg.propertiesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PropertiesdemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(PropertiesdemoApplication.class, args);	
		ConfigProperties configProperties = new ConfigProperties();
		System.out.println("Hello World "+configProperties.getFrom());
	}

}
