package com.shop.spring_boot.database;

import com.shop.spring_boot.entity.Customer;
import com.shop.spring_boot.entity.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public interface Database {
    List<Customer> createCustomer();
    List<Product> createProduct(String code, String label, BigDecimal price);


    Customer getCustomerById(UUID customerId);

    Product getProductById(UUID productId);
}
