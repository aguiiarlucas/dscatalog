
package com.devsuperior.dscatalog.dto;

import com.devsuperior.dscatalog.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private String name;

    public CategoryDTO(Category entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }
}