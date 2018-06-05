package reichhorn.spring.recipeapp.services;

import reichhorn.spring.recipeapp.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
