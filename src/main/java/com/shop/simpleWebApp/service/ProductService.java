package com.shop.simpleWebApp.service;

import com.shop.simpleWebApp.model.Product;
import com.shop.simpleWebApp.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    /*List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Canon Camera", 70000),
            new Product(103, "Macbook", 100000)));*/

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(new Product());
    }

    public void addProduct(Product product) {
        repository.save(product);
    }

    public void updateProduct(Product product) {
        repository.save(product);
    }

    public void deleteProduct(int id) {
        repository.deleteById(id);
    }
}
