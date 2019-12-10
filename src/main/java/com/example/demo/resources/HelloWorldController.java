package com.example.demo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/docker")
public class HelloWorldController {
	
	@GetMapping
	public String hello() {
		return "Docker project with ci cd pipeline and pushing in to repository";
	}

}
