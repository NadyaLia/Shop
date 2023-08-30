package com.shop.spring_boot.entity;

import java.util.List;
import java.util.UUID;

public interface Customer {
    UUID getId();
    void setId(UUID id);
    List<Product> getCart();
    void setCart(List<Product> cart);

    void addToCart(Product product);

    double getCartAmount();
}
