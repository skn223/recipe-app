package skn.springframework.recipeproject.services;

import skn.springframework.recipeproject.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
