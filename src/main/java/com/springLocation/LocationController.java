package com.springLocation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
	
	@PostMapping("/updatelocation")
	public String updateLocation(@RequestParam String id) {
		System.out.println(id);
		return "received";
	}
	
	

}