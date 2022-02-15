package com.devsuperior.dscatalog.dto;

import java.io.Serializable;


import com.devsuperior.dscatalog.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode

public class CategoryDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;


    public CategoryDTO() {

    }

    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;

    }

    public CategoryDTO(Category entity) {
        this.id = entity.getId();
        this.name = entity.getName();

    }
 

}