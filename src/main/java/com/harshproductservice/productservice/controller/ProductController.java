package com.harshproductservice.productservice.controller;

import org.springframework.web.bind.annotation.RestController;

import com.harshproductservice.productservice.DTO.FakestoreProductDTO;
import com.harshproductservice.productservice.model.Product;
import com.harshproductservice.productservice.service.FakestoreProductService;
import com.harshproductservice.productservice.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/products")
public class ProductController{
    private ProductService productService;

    ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return this.productService.getProductById(id);
    }
    
}
