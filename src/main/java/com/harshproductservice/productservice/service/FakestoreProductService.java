package com.harshproductservice.productservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.harshproductservice.productservice.DTO.FakestoreProductDTO;
import com.harshproductservice.productservice.model.Category;
import com.harshproductservice.productservice.model.Product;


@Service
public class FakestoreProductService implements ProductService{

    @Override
    public Product getProductById(Long id) {
        
        RestTemplate restTemplate = new RestTemplate();
        FakestoreProductDTO fakestoreproductdto = restTemplate.getForObject("https://fakestoreapi.com/products/"+id,FakestoreProductDTO.class);

        if (fakestoreproductdto == null) {
            return null;
        }

        return convertFakestoreProductdtoToProduct(fakestoreproductdto);
        
    }

    private Product convertFakestoreProductdtoToProduct(FakestoreProductDTO fakestoreproductdto){
        Product product = new Product();
        product.setId(fakestoreproductdto.getId());
        product.setTitle(fakestoreproductdto.getTitle());
        product.setDescription(fakestoreproductdto.getDescription());
        product.setImage(fakestoreproductdto.getImage());
        
        Category c = new Category();
        c.setDescription(fakestoreproductdto.getDescription());
        // c.setId(fakestoreproductdto.getId());
        // c.setTitle(fakestoreproductdto.getTitle());
        product.setCategory(c);

        return product;
    }

    
    
}
