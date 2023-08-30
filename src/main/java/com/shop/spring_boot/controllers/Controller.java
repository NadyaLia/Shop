package com.shop.spring_boot.controllers;

import com.shop.spring_boot.entity.CommonCustomer;
import com.shop.spring_boot.entity.Customer;
import com.shop.spring_boot.entity.Product;
import com.shop.spring_boot.repository.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


import java.math.BigDecimal;
import java.util.UUID;
@RestController
@RequestMapping("/shop")
public class Controller {

    @Autowired
    private Repository repository;

    @PostMapping
    public Customer createCustomer() {
        return repository.createCustomer(UUID.randomUUID());
    }
    @PostMapping
    public void createProduct(@RequestBody String code, String label, BigDecimal price) {
        repository.createProduct(UUID.randomUUID(), code, label, price);
    }
    @PostMapping
    public void addToCart(@RequestBody UUID customerId, UUID productId) {
        repository.addToCart(customerId, productId);
    }

}
