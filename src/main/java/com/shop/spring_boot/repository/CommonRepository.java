package com.shop.spring_boot.repository;

import com.shop.spring_boot.database.Database;
import com.shop.spring_boot.entity.Customer;
import com.shop.spring_boot.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.UUID;

public class CommonRepository implements Repository {
    @Autowired
    private Database database;

    @Override
    public Customer createCustomer(UUID id) {
        database.createCustomer();
        return null;
    }

    @Override
    public void createProduct(UUID id, String code, String label, BigDecimal price) {
        database.createProduct(code, label, price);
    }

    @Override
    public void addToCart(UUID customerId, UUID productId) {
        Customer customer = database.getCustomerById(customerId);
        Product product = database.getProductById(productId);
        customer.addToCart(product);
    }
}
