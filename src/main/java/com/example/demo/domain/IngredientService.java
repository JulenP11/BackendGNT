package com.example.demo.domain;

import java.util.UUID;

import com.example.demo.dto.CreateIngredientDTO;

public class IngredientService {
    public static Ingredient create(CreateIngredientDTO dto) {
        Ingredient ingredient = new Ingredient();
        ingredient.name = dto.name;
        ingredient.price = dto.price;
        ingredient.id = UUID.randomUUID();
        return ingredient;
    }
}
