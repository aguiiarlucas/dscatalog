package com.devsuperior.dscatalog.repositories;


import com.devsuperior.dscatalog.entities.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.Optional;

@DataJpaTest // Carrega somente os componentes relacionado ao Spring JPA
public class ProductRepositoryTests {

    @Autowired
    private ProductRepository repository;

    @Test
    public  void deleteShouldDeleteObjectWhenIdExists(){
        //AAA
        long existingId = 1L; //Arange
        repository.deleteById(existingId); //Act
        Optional<Product>result = repository.findById(existingId);
        Assertions.assertFalse(result.isPresent());// Assertion

    }
    @Test
    public void deleteShouldThrowEmptyResultDataAccessExceptionWhenIdNotExists(){
        long  nonExistingId = 1000L;
        Assertions.assertThrows(EmptyResultDataAccessException.class,()->{
            repository.deleteById(nonExistingId);
        });


    }



}
