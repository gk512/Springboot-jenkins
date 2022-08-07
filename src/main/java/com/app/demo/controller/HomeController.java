package com.app.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	public static Logger log=LoggerFactory.getLogger(HomeController.class);
	
	
	@GetMapping("/home")
	public String welcome() {
		log.info("Entered to Main method....");
		return "welcome to spring boot project with jenkins ";
	}

}
