package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductConttroller {
    ProductServiceImpl productService = new ProductServiceImpl();

    public List<Product> findAll() {
        return productService.findAll();
    }

    public void add(Product product) {
        productService.add(product);
    }

    public void edit(int index, Product product) {
        productService.edit(index, product);
    }

    public void remove(int index) {
        productService.remove(index);
    }

    public Product find(String name) {
        return productService.find(name);
    }

    public void increasePrice() {
        productService.increasePrice();
    }

    public void reductionPrice() {
        productService.reductionPrice();
    }
}
