package reichhorn.spring.recipeapp.services;

import reichhorn.spring.recipeapp.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long id);
}
