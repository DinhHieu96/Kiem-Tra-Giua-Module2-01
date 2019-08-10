package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.repository.ProductRepository;
import com.codegym.repository.impl.ProductRepositoryImpl;
import com.codegym.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductRepository productRepositoy=new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return productRepositoy.findAll();
    }

    @Override
    public void add(Product product) {
        productRepositoy.add(product);
    }

    @Override
    public void edit(int index, Product product) {
        productRepositoy.edit(index,product);
    }

    @Override
    public void remove(int index) {
        productRepositoy.remove(index);
    }

    @Override
    public Product find(String name) {
        return productRepositoy.find(name);
    }

    @Override
    public void increasePrice() {
        productRepositoy.reductionPrice();
    }

    @Override
    public void reductionPrice() {
        productRepositoy.reductionPrice();
    }
}
