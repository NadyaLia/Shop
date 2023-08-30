package com.shop.spring_boot.database;

import com.shop.spring_boot.entity.CommonCustomer;
import com.shop.spring_boot.entity.CommonProduct;
import com.shop.spring_boot.entity.Customer;
import com.shop.spring_boot.entity.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CommonDatabase implements Database {
    private List<Customer> customers = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    public CommonDatabase() {
        customers.add((new CommonCustomer(UUID.randomUUID())));
        products.add(new CommonProduct(UUID.randomUUID(), "Apple Watch", "Apple", new BigDecimal("399.99")));
        products.add(new CommonProduct(UUID.randomUUID(), "iPhone", "Apple", new BigDecimal("999.99")));
    }

    @Override
    public List<Customer> createCustomer() {
        CommonCustomer newCustomer = new CommonCustomer(UUID.randomUUID());
        customers.add(newCustomer);
        return new ArrayList<>(customers);
    }

    @Override
    public List<Product> createProduct(String code, String label, BigDecimal price) {
        CommonProduct newProduct = new CommonProduct(UUID.randomUUID(), code, label, price);
        products.add(newProduct);
        return new ArrayList<>(products);
    }

    @Override
    public Customer getCustomerById(UUID customerId) {

        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if(customer.getId() == customerId) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public Product getProductById(UUID productId) {

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if(product.getId() == productId) {
                return product;
            }
        }

        return null;
    }
}
