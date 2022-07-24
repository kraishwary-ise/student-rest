package com.springLocation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class LocationController {
	
	@Autowired
	private LocoDao dao;

	
	@PostMapping("/updatelocation")
	public  String updateLocation(@RequestParam String id) {
		System.out.println(id+"0");
		return "receivedooo";
	}
	
	@PostMapping("/updatelocations")
	public LocationModel updateLocation1(@RequestBody LocationModel loco) {
		
		Location loc = loco.getLocation();
		System.out.println(loc.getLink());
		
		//this.dao.insertlocation(loc);
		return this.dao.insertData(loco);
	}
	
	

}
