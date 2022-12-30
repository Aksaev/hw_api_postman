package me.aksaev.hw_api_postman.model;

import java.util.List;

public class Recipe {
    private String name;
    private int cookingTime;
    private List<Ingredient> ingredients;
    private List<String> steps;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            throw new RuntimeException("Нет названия рецепта!");
        } else {
            this.name = name;
        }
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        if (cookingTime < 0) {
            throw new RuntimeException("Отрицательное значение времени приготовления!");
        } else {
            this.cookingTime = cookingTime;
        }
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        if (ingredients == null) {
            throw new RuntimeException("Ингредиенты отсутствуют!");
        } else {
            this.ingredients = ingredients;
        }
    }

    public List<String> getSteps() {
        return steps;
    }

    public void setSteps(List<String> steps) {
        if (steps == null) {
            throw new RuntimeException("Инструкция приготовления отсутствует!");
        } else {
            this.steps = steps;
        }
    }

}