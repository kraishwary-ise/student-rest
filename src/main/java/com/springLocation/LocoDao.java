package com.springLocation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocoDao {
	@Autowired
	private Locorepository locorepo;
	
	
	public void insertData(LocationModel loco) {
		
		this.locorepo.save(loco);
		
		
	}
}
