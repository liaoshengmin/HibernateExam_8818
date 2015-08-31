package com.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city", schema = "sakila")
public class City {
	private int city_id;
	private String city;
	private int country_id;
	private Timestamp last_update;
	
	public City() {}
	
	public City(int city_id,String city,int country_id,Timestamp last_update){
		this.city_id=city_id;
		this.city=city;
		this.country_id=country_id;
		this.last_update=last_update;
	}
	
	@Id
    @Column(name = "city_id")
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	
	@Column(name = "city")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name = "country_id")
	public int getCountry_id() {
		return country_id;
	}
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	@Column(name = "last_update")
	public Timestamp getLast_update() {
		return last_update;
	}

	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}

	
	
	

}
