package com.springLocation;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "loco_model")
public class LocationModel {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	    	
		@Column(name="device_name")
		private String device_name;
		
		@Column(name="device_model")
		private String device_model;
		
		@Column(name="device_id")
		private String device_id;
		
		@Column(name="last_update")
		private String last_update;
		
		@OneToOne(cascade = CascadeType.ALL)
	     @JoinColumn(name = "cell_no",referencedColumnName = "id")
	    private Location location;
		
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

	
		public String getDevice_name() {
			return device_name;
		}

		public void setDevice_name(String device_name) {
			this.device_name = device_name;
		}

		public String getDevice_model() {
			return device_model;
		}

		public void setDevice_model(String device_model) {
			this.device_model = device_model;
		}

		public String getDevice_id() {
			return device_id;
		}

		public void setDevice_id(String device_id) {
			this.device_id = device_id;
		}

		public String getLast_update() {
			return last_update;
		}

		public void setLast_update(String last_update) {
			this.last_update = last_update;
		}

		public Location getLocation() {
			return location;
		}

		public void setLocation(Location location) {
			this.location = location;
		}

	

		
		
		
		
		
		
		
		
	
	
	

}
