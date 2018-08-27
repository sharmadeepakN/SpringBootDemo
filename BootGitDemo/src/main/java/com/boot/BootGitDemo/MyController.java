package com.boot.BootGitDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class MyController {
	
	public static void main(String[] args) {
		SpringApplication.run(MyController.class, args);
		
		System.out.println("application started");
	}

	@RequestMapping(value = "/view")
	public String show() {
		

		return "home";

	}

}
