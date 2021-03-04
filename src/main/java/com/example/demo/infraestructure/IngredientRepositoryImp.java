package com.example.demo.infraestructure;

import com.example.demo.domain.Ingredient;
import com.example.demo.domain.IngredientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IngredientRepositoryImp implements IngredientRepository {
    
    private final IngredientJPARepository ingredientJPARepository;
    
    @Autowired
    public IngredientRepositoryImp(final IngredientJPARepository ingredientJPARepository){
        this.ingredientJPARepository = ingredientJPARepository;
    }

    public void add(Ingredient ingredient){
        this.ingredientJPARepository.save(ingredient);
    }
}
