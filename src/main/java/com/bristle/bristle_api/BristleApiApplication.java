package com.bristle.bristle_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BristleApiApplication {

	@GetMapping("/yee")
	public String hi(){
		return "<h>hi andy</h>";
	}
	public static void main(String[] args) {
		SpringApplication.run(BristleApiApplication.class, args);
	}

}
