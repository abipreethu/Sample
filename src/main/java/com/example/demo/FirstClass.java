package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstClass {
	@GetMapping("/get")
	public String num() {
		return "Hello World";
	}
	@GetMapping("/sum")
   public int add() {
return 10+10;
	}
	
}

