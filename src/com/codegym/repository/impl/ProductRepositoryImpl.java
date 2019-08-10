package com.codegym.repository.impl;

import com.codegym.model.Product;
import com.codegym.repository.ProductRepository;

import java.util.*;

public class ProductRepositoryImpl implements ProductRepository {
    ArrayList<Product> listProduct = new ArrayList<>();

    @Override
    public List<Product> findAll() {
        return listProduct;
    }

    @Override
    public void add(Product product) {
        if (product != null) {
            listProduct.add(product);
        }
    }

    @Override
    public void edit(int index, Product product) {
        if (index > listProduct.size()) {
            System.out.println("index>size");
        } else {
            listProduct.get(index).setId(product.getId());
            listProduct.get(index).setName(product.getName());
            listProduct.get(index).setPrice(product.getPrice());
            listProduct.get(index).setStaus(product.isStaus());
            listProduct.get(index).setDescription(product.getDescription());
        }
    }

    @Override
    public void remove(int index) {
        if (index > listProduct.size()) {
            System.out.println("index>size");
        } else {
            listProduct.remove(index);
        }
    }

    @Override
    public Product find(String name) {
        for (int i = 0; i < listProduct.size(); i++) {
            String productName = listProduct.get(i).getName();
            if (productName.equals(name)) {
                return listProduct.get(i);
            }
        }
        return null;
    }

    @Override
    public void increasePrice() {
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else {
                    if (o1.getPrice() == o2.getPrice()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
    }

    @Override
    public void reductionPrice() {
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else {
                    if (o1.getPrice() == o2.getPrice()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
    }
}
