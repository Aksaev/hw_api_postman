package me.aksaev.hw_api_postman.model;

import java.util.Objects;

public class Ingredient {
    private String name;
    private int count;
    private String measureUnit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            throw new RuntimeException("Нет названия ингридиента!");
        } else {
            this.name = name;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count < 0) {
            throw new RuntimeException("Отрицательное значение количества ингредиента!");
        } else {
            this.count = count;
        }
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

}