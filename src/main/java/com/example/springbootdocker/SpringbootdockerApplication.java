package com.example.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class SpringbootdockerApplication {

	@GetMapping
	public String user() {
		return "cicd pipeline works!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootdockerApplication.class, args);
	}

}
