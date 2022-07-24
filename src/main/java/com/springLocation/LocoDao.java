package com.springLocation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocoDao {
	@Autowired
	private Locorepository locorepo;
	
	@Autowired
	private LocationRepository locorepo2;
	
	
	public LocationModel insertData(LocationModel loco) {
		
		return this.locorepo.save(loco);
		
		
	}


	public void insertlocation(Location loc) {
		// TODO Auto-generated method stub
		this.locorepo2.save(loc);
		
	}
}
