package com.shop.spring_boot.entity;

import java.math.BigDecimal;
import java.util.UUID;

public interface Product {
    UUID getId();
    String getCode();
    String getLabel();
    BigDecimal getPrice();

    void setId(UUID id);
    void setCode(String code);
    void setLabel(String label);
    void setPrice(BigDecimal price);
}
