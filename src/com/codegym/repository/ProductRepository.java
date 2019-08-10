package com.codegym.repository;

import com.codegym.model.Product;

public interface ProductRepository extends GeneralRepository<Product> {
    void edit(int index, Product product);

    void remove(int index);

    Product find(String name);

    void increasePrice();

    void reductionPrice();
}
