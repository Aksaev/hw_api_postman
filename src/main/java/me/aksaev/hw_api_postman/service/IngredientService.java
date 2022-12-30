package me.aksaev.hw_api_postman.service;

import me.aksaev.hw_api_postman.model.Ingredient;

public interface IngredientService {
    Ingredient add(Ingredient ingredient);
    Ingredient get(long id);
    Ingredient update(long id, Ingredient ingredient);
    Ingredient remove(long id);
}
