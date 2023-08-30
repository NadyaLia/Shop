package com.shop.spring_boot.repository;

import com.shop.spring_boot.entity.Customer;
import com.shop.spring_boot.entity.Product;

import java.math.BigDecimal;
import java.util.UUID;

public interface Repository {

    Customer createCustomer(UUID id);
    void createProduct(UUID id, String code, String label, BigDecimal price);
    void addToCart(UUID customerId, UUID productId);

}
