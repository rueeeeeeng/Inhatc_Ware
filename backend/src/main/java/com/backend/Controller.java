package com.backend;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("hello")
	public List<String> hello(){
		return Arrays.asList("안녕하세요","Hello");
	}
}
