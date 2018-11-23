package com.mohbility.services;

import com.mohbility.commands.IngredientCommand;

/**
 * @project spring5-recipe-app
 * @author: kbility
 * @Date: 11/21/2018
 */
public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId,Long ingredientID);

    IngredientCommand savedIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
