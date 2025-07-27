package com.SpringMVC.SpringBootApplication.controller;

import com.SpringMVC.SpringBootApplication.Entity.Supplier;
import com.SpringMVC.SpringBootApplication.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suppliers")
@CrossOrigin(origins = "*")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/add")
    public Supplier createSupplier(@RequestBody Supplier supplier) {
        return supplierService.addSupplier(supplier);
    }

    @GetMapping("/allSupliers")
    public List<Supplier> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }

    @PutMapping("/{id}")
    public Supplier updateSupplier(@PathVariable long id, @RequestBody Supplier updatedSupplier) {
        return supplierService.updateSupplier(id, updatedSupplier);
    }

    @DeleteMapping("/{id}")
    public void deleteSupplier(@PathVariable Long id) {
        supplierService.deleteSupplier(id);
    }
}
