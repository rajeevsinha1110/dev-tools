package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@GetMapping("/")
	public String display(){
		return "Hello-Spring Boot"+LocalDateTime.now();
		
	}
	
	@GetMapping("/workout")
	public String dailyWorkOut(){
		return "Run a hard 6 k";
		
	}

}
