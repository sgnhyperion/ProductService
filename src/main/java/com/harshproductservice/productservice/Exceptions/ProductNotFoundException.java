package com.harshproductservice.productservice.Exceptions;

import lombok.Getter;

@Getter
public class ProductNotFoundException extends RuntimeException{
    private Long id;

    public ProductNotFoundException(Long id, String messege){
        super(messege);
        this.id = id;
    }
    
}
