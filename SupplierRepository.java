package com.SpringMVC.SpringBootApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringMVC.SpringBootApplication.Entity.Supplier;


 
public interface SupplierRepository extends JpaRepository<Supplier ,Long>{}
