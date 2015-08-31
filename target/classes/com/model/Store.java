package com.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address", schema = "sakila")
public class Store {
	private int store_id;
	private int manager_staff_id;
	private int address_id;
	private Timestamp last_update;
	
	public Store(){}

	@Id
    @Column(name = "store_id")
	public int getStore_id() {
		return store_id;
	}

	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}

	@Column(name = "manager_staff_id")
	public int getManager_staff_id() {
		return manager_staff_id;
	}

	public void setManager_staff_id(int manager_staff_id) {
		this.manager_staff_id = manager_staff_id;
	}

	@Column(name = "address_id")
	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	@Column(name = "last_update")
	public Timestamp getLast_update() {
		return last_update;
	}

	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}

	
	
	

}
