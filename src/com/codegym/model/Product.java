package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private int price;
    private boolean staus;
    private String description;

    public Product() {
    }

    public Product(int id, String name, int price, boolean staus, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.staus = staus;
        this.description = this.description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStaus() {
        return staus;
    }

    public void setStaus(boolean staus) {
        this.staus = staus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
