package com.devsuperior.dscatalog.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;


@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    @Size(min=5,max=60,message = "Must have 5-60 characters")
    @NotBlank(message ="Field required" )
    private String name;
    @NotBlank(message ="Field required" )
    private String description;
    @Positive(message = "Price must be a positive value")
    private Double price;
    private String imgUrl;
    @PastOrPresent(message = "The product date cannot be in the future")
    private Instant date;


    private List<CategoryDTO>categories = new ArrayList<>();

    public  ProductDTO(Product entity){
        this.id = entity.getId();
        this.name = entity.getName();
        this.description = entity.getDescription();
        this.price = entity.getPrice();
        this.imgUrl = entity.getImgUrl();
        this.date = entity.getDate();
    }
    public  ProductDTO(Product entity , Set<Category>categories){
        this(entity);
        categories.forEach(cat ->this.categories.add(new CategoryDTO(cat)));
    }
}