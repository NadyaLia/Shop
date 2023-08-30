package com.shop.spring_boot.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CommonCustomer implements Customer {
    private UUID id;
    private List<Product> cart;

    public CommonCustomer(UUID id) {
        this.id = UUID.randomUUID();
        this.cart = new ArrayList<>();
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public List<Product> getCart() {
        return cart;
    }

    @Override
    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    @Override
    public void addToCart(Product product) {
        cart.add(product);
    }

    @Override
    public double getCartAmount() {
        return cart.stream().map(Product::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add).doubleValue();
    }
}
