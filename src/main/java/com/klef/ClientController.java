package com.klef;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@GetMapping("/")
	public String home() {
		return "CI/CD AND CLOUD DEVOPS";
	}

	@GetMapping("/test")
	public String test() {
		return "Deploy springboot using jennkins";
	}
}
