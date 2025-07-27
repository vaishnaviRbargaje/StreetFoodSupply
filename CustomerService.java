package com.SpringMVC.SpringBootApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMVC.SpringBootApplication.Entity.Customer;
import com.SpringMVC.SpringBootApplication.repository.CustomerRepository;

@Service
public class CustomerService {

       @Autowired
	    private CustomerRepository CustomerRepo;

	    public Customer addCustomer(Customer customer) {
	        return CustomerRepo .save(customer);
	    }

	    public List<Customer> getAllCustomer() {
	        return CustomerRepo.findAll();
	    }

	    public Customer updateCustomer(Long id, Customer updated) {
	        Customer customer = CustomerRepo.findById(id)
	            .orElseThrow(() -> new RuntimeException(" not found with ID: " + id));
	        
	        customer.setName(updated.getName());
	        customer.setContact(updated.getContact());
	        customer.setLocation(updated.getLocation());
	        customer.setOrderDetails(updated.getOrderDetails());

	        return CustomerRepo.save(customer);
	    }

	    public void deleteCustomer(Long id) {
	        CustomerRepo.deleteById(id);
	    }

	    public List<Customer> getCustomersBySupplierId(Long supplierId) {
	        return CustomerRepo.findBySupplierId(supplierId);
	    }
	    
	    

	}


