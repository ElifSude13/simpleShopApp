package com.shop.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Setter
@Getter
@Component
@Entity
public class Product {

    @Id
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
