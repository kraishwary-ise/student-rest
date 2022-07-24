package com.springLocation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loco_model")
public class LocationModel {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="lat")
	private Integer lat;
	
	@Column(name="model")
	private String model;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getLat() {
		return lat;
	}
	public void setLat(Integer lat) {
		this.lat = lat;
	}
	public LocationModel() {
		
	}

}
