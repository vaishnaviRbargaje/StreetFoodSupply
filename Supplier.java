package com.SpringMVC.SpringBootApplication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Supplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private long contact;
	private String location;
	private String rawMaterialType;
	
	public Supplier (Long id, String name, long contact, String location, String rawMaterialType) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.location = location;
		this.rawMaterialType = rawMaterialType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRawMaterialType() {
		return rawMaterialType;
	}

	public void setRawMaterialType(String rawMaterialType) {
		this.rawMaterialType = rawMaterialType;
	}

	public Supplier () {
		super();
	}

	

}
