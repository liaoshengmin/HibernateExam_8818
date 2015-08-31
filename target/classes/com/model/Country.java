package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country", schema = "sakila")
public class Country {
	private int country_id;
	private String country;
	private String last_update;
	
	public Country(){}
	
	public Country(int country_id,String country,String last_update){
		this.country_id=country_id;
		this.country=country;
		this.last_update=last_update;
	}

	@Id
    @Column(name = "customer_id")
	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	@Column(name = "country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "last_update")
	public String getLast_update() {
		return last_update;
	}

	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
	
	

}
