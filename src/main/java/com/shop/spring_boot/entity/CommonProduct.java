package com.shop.spring_boot.entity;

import java.math.BigDecimal;
import java.util.UUID;

public class CommonProduct implements Product {
    private UUID id;
    private String code;
    private String label;
    private BigDecimal price;

    public CommonProduct(UUID id, String code, String label, BigDecimal price) {
        this.id = id;
        this.code = code;
        this.label = label;
        this.price = price;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
