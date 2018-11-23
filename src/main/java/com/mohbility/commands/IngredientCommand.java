package com.mohbility.commands;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by jt on 6/13/17.
 */
@Data

public class IngredientCommand {
    private Long id;
    private Long recipeId;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasureCommand uom;
    //private RecipeCommand recipe;
}