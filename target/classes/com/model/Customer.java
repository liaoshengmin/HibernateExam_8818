package com.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer", schema = "sakila")
public class Customer implements Serializable {
	private short customer_id;
	private int store_id;
	private String first_name;
	private String last_name;
	private String email;
	private int address_id;
	private int active;
	private Date create_date;
	private Timestamp last_update;
	
	public Customer(){}
	public Customer(String first_name,String last_name,String email,int address_id){
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.address_id = address_id;
	}

	@Id
    @Column(name = "customer_id")
	public short getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(short customer_id) {
		this.customer_id = customer_id;
	}
	

	@Column(name = "store_id")
	public int getStore_id() {
		return store_id;
	}

	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}

	@Column(name = "first_name")
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	@Column(name = "last_name")
	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "address_id")
	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	@Column(name = "active")
	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	@Column(name = "create_date")
	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	@Column(name = "last_update")
	public Timestamp getLast_update() {
		return last_update;
	}

	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}

	
	
	
	

}
