package com.shop.simpleWebApp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Setter
@Getter
@Component
public class Product {

    private int id;
    private String productName;
    private int price;

    public Product() {
    }

    public Product(int id, String productName, int price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
