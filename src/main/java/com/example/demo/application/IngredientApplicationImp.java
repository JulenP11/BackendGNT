package com.example.demo.application;

import com.example.demo.domain.Ingredient;
import com.example.demo.domain.IngredientRepository;
import com.example.demo.domain.IngredientService;
import com.example.demo.dto.CreateIngredientDTO;
import com.example.demo.dto.IngredientDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientApplicationImp implements IngredientApplication {
    
    private final IngredientRepository ingredientRepository;

    @Autowired
    public IngredientApplicationImp(final IngredientRepository ingredientRepository){
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public IngredientDTO add(CreateIngredientDTO dto){
        Ingredient ingredient = IngredientService.create(dto);
        this.ingredientRepository.add(ingredient);
        IngredientDTO ingredientDTO = new IngredientDTO();
        ingredientDTO.id = ingredient.id;
        ingredientDTO.name = ingredient.name;
        ingredientDTO.price = ingredient.price;
        return ingredientDTO;
    }
}
