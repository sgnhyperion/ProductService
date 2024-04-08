package com.harshproductservice.productservice.model;
import com.harshproductservice.productservice.model.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product{
    private Long id;
    private String title;
    private String description;
    private Double price;
    private Category category;
    private String image;
}
