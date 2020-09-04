package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	/* http://localhost:8080/evenForm */
	@GetMapping("/evenForm")
	public String evenForm() {
		return "eventest";
	}
	
	/*http://localhost:8080/processEven */
	@GetMapping("/processEven")
	@ResponseBody
	public boolean processEven(@RequestParam("number") int number) {
		return (number % 2 == 0);
	}
	
	
}
