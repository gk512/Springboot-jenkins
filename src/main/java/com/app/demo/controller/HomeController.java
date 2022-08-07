package com.app.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping("/home")
	public String welcome() {
		return "welcome to spring boot project with jenkins ";
	}

}
