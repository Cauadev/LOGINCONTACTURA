package com.cauadev.logincontactura.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greetings/hello")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}

}
