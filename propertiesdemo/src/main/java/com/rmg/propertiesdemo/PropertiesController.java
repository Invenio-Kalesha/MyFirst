package com.rmg.propertiesdemo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class PropertiesController {
	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello() {
		System.out.println("From Hello world");
		return "Hello World Developer!!!";
	}
}