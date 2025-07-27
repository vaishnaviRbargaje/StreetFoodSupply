package com.SpringMVC.SpringBootApplication.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMVC.SpringBootApplication.Entity.Supplier;
import com.SpringMVC.SpringBootApplication.repository.SupplierRepository;

@Service 
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepo;

    public Supplier addSupplier(Supplier supplier) {
        return supplierRepo.save(supplier);
    }

    public List<Supplier> getAllSuppliers() {
        return supplierRepo.findAll();
    }

    public Supplier updateSupplier(Long id, Supplier updated) {
        Supplier supplier = supplierRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Supplier not found with ID: " + id));
        
        supplier.setName(updated.getName());
        supplier.setContact(updated.getContact());
        supplier.setLocation(updated.getLocation());
        supplier.setRawMaterialType(updated.getRawMaterialType());

        return supplierRepo.save(supplier);
    }

    public void deleteSupplier(Long id) {
        supplierRepo.deleteById(id);
    }
}
