package com.harshproductservice.productservice.service;

import org.springframework.stereotype.Service;

import com.harshproductservice.productservice.model.Product;

public interface ProductService {
    public Product getProductById(Long id);

    public Product[] getAllProducts();
    
}
