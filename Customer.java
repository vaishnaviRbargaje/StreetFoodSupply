package com.SpringMVC.SpringBootApplication.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    private String contact;
    
    private String location;

    @Column(name = "order_details")
    private String orderDetails;

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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Customer(Long id, String name, String contact, String location, String orderDetails) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.location = location;
		this.orderDetails = orderDetails;
	}

	public Customer() {
		super();
	}
	
	@ManyToOne
	@JoinColumn(name = "supplier_id")  // Foreign key column
	private Supplier supplier;

    
    // Getters and setters
}
