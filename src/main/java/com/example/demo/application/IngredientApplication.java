package com.example.demo.application;

import com.example.demo.dto.CreateIngredientDTO;
import com.example.demo.dto.IngredientDTO;

public interface IngredientApplication {
    public IngredientDTO add(CreateIngredientDTO dto);
}
