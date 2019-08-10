package com.codegym.service;

import com.codegym.model.Product;

public interface ProductService extends GeneralService<Product> {
    void edit(int index,Product product);
    void remove(int index);
    Product find(String name);
    void increasePrice();
    void reductionPrice();
}
