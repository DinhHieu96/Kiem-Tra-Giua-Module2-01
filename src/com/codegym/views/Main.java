package com.codegym.views;

import com.codegym.controller.ProductConttroller;
import com.codegym.model.Product;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int choie;
        ProductConttroller productConttroller = new ProductConttroller();
        do {
            menu();
            Scanner input = new Scanner(System.in);
            choie = input.nextInt();
            switch (choie) {
                case 1: {
                    List<Product> productList = productConttroller.findAll();
                    for (Product product : productList) {
                        System.out.println("ID: " + product.getId() + " Name: " + product.getName() + " price: " + product.getPrice() +
                                " Status " + product.isStaus() + " Description " + product.getDescription());
                    }
                    break;
                }
                case 2: {
                    Product product = createProduct();
                    productConttroller.add(product);
                    break;
                }
                case 3: {
                    System.out.println("Nhap index of product want edit: ");
                    int index = input.nextInt();
                    input.nextLine();
                    System.out.println("Nhap product: ");
                    Product product = createProduct();
                    productConttroller.edit(index, product);
                    break;
                }
                case 4: {
                    System.out.println("Nhap index need remove: ");
                    int index = input.nextInt();
                    input.nextLine();
                    productConttroller.remove(index);
                    break;
                }
                case 5: {
                    System.out.println("Nhap name need find: ");
                    String name = input.nextLine();
                    productConttroller.find(name);
                    break;
                }
                case 6: {
                    productConttroller.increasePrice();
                    break;
                }
                case 7: {
                    productConttroller.reductionPrice();
                    break;
                }
                default: {
                    System.out.println("Please choie again ");
                    break;
                }
            }
        } while (choie != 0);
    }

    public static void menu() {
        System.out.println("1. Hien thi danh sach");
        System.out.println("2. Them san pham moi");
        System.out.println("3. Sua thong tin san pham");
        System.out.println("4. Xoa san pham");
        System.out.println("5. Tim san pham theo ten");
        System.out.println("6. Sap xep san pham tang dan");
        System.out.println("7. Sap xep san pham giam dan");
        System.out.println("0. Thoat");
        System.out.println("Nhap vao chon lua: ");
    }

    public static Product createProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Nhap Name: ");
        String name = input.nextLine();
        System.out.println("Nhap Price: ");
        int price = input.nextInt();
        input.nextLine();
        System.out.println("Nhap Status: ");
        boolean status = input.nextBoolean();
        System.out.println("Nhap Description: ");
        String description = input.nextLine();

        Product product = new Product(id, name, price, status, description);
        return product;
    }

}