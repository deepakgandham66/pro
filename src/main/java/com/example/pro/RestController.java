package com.example.pro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@org.springframework.web.bind.annotation.RestController
@RequestMapping("/testing")
public class RestController {
	@GetMapping("/")
	public String Greet() {
		return "Good Night";
	}
}
