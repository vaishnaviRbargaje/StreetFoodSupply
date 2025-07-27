package com.SpringMVC.SpringBootApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringMVC.SpringBootApplication.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findBySupplierId(Long supplierId);  // ✅ Step 4 method
}

