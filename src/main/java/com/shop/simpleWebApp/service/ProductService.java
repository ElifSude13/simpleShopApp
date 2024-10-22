package com.shop.simpleWebApp.service;

import com.shop.simpleWebApp.model.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Canon Camera", 70000),
            new Product(103, "Macbook", 100000)));

    public Product getProductById(int id) {
        return products.stream().
                filter(p -> p.getId() == id).
                findFirst().orElse(new Product(100, "No item", 0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index = 0;
        for(int i = 0; i <products.size(); i++)
            if(products.get(i).getId() == product.getId())
                index = i;
        products.set(index, product);
    }

    public void deleteProduct(int id) {
        int index = 0;
        for(int i = 0; i <products.size(); i++)
            if(products.get(i).getId() == id)
                index = i;

        products.remove(index);
    }
}
