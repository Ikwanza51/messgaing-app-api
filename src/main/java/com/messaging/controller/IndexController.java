package com.messaging.controller;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	@GetMapping("oracle") 
			public String getOracle() {
				return "Hi, Oracle";
			}
}
