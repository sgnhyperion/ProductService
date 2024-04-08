package com.harshproductservice.productservice.controller;

import org.springframework.web.bind.annotation.RestController;

import com.harshproductservice.productservice.DTO.ExceptionDTO;
import com.harshproductservice.productservice.DTO.FakestoreProductDTO;
import com.harshproductservice.productservice.model.Product;
import com.harshproductservice.productservice.service.FakestoreProductService;
import com.harshproductservice.productservice.service.ProductService;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
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
        // throw new RuntimeException("Something went wrong");
        // ResponseEntity<Product> responseEntity = null;
        // Product product = null;
        // try {
        //     product = this.productService.getProductById(id);
        //     responseEntity = new ResponseEntity<>(product,HttpStatus.OK);
        //     return responseEntity;
        // } catch (RuntimeException e) {
        //     ExceptionDTO exceptionDTO = new ExceptionDTO();
        //     exceptionDTO.setMessage("Product not found");
        //     ResponseEntity<ExceptionDTO> responseEntityException = new ResponseEntity<>(exceptionDTO,HttpStatus.BAD_REQUEST);
        //     return responseEntityException;
        // }

        return this.productService.getProductById(id);
    }

    @GetMapping()
    public Product[] getAllProducts(){
        return this.productService.getAllProducts();
    }
    
}
