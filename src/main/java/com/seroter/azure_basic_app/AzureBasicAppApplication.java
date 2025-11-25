package com.seroter.azure_basic_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureBasicAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureBasicAppApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String ABC() {
		
		return "ABCD";
	}

}
