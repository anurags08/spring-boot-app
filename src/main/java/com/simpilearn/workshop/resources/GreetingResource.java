package com.simpilearn.workshop.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingResource {
	
	// URI -- > http:localhost:8080
		@RequestMapping("/")
		public String greet() {
			return "Welcome to the Spring Boot App !";
		}

}
