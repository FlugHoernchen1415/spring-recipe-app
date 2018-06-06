package reichhorn.spring.recipeapp.services;

import reichhorn.spring.recipeapp.commands.RecipeCommand;
import reichhorn.spring.recipeapp.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
