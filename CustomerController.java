package com.SpringMVC.SpringBootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringMVC.SpringBootApplication.Entity.Customer;

import com.SpringMVC.SpringBootApplication.service.CustomerService;

@RestController
	@RequestMapping("/api/customer")
	@CrossOrigin(origins = "*")
	public class CustomerController {

	    @Autowired
	    private CustomerService customerService;

	    @PostMapping("/add")
	    public Customer createCustomer(@RequestBody Customer customer) {
	        return customerService.addCustomer(customer);
	    }

	    @GetMapping("/allCustomer")
	    public List<Customer> getAllCustomer() {
	        return customerService.getAllCustomer();
	    }
	    
	   

	    @PutMapping("/{id}")
	    public Customer updateCustomer(@PathVariable long id, @RequestBody Customer updatedCustomer) {
	        return customerService.updateCustomer(id, updatedCustomer);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteCustomer(@PathVariable Long id) {
	        customerService.deleteCustomer(id);
	    }
	    @GetMapping("/supplier/{supplierId}")
	    public List<Customer> getCustomersBySupplier(@PathVariable Long supplierId) {
	        return customerService.getCustomersBySupplierId(supplierId);
	    }

	    
	    
	}



