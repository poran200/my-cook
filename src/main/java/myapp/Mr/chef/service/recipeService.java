package myapp.Mr.chef.service;


import myapp.Mr.chef.exception.RecourseAlreadyExist;
import myapp.Mr.chef.exception.ResourceNotFoundException;
import myapp.Mr.chef.model.Recipe;
import myapp.Mr.chef.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class recipeService {
    private final RecipeRepository reciperepository;

    public recipeService(RecipeRepository reciperepository) {
        this.reciperepository = reciperepository;
    }

    public List<Recipe> findAll() {
        List <Recipe> recipeList = new ArrayList<>();
        recipeList.addAll(reciperepository.findAll());
        return recipeList;
    }

    public Recipe findById(long id) throws ResourceNotFoundException {
        Recipe rep = reciperepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
        return rep;

    }

    public Recipe create (Recipe recipe) throws RecourseAlreadyExist {

        Optional<Recipe> byId = reciperepository.findById(recipe.getId());
        if (byId.isPresent()){
            throw new RecourseAlreadyExist(""+recipe.getId()+"already exist!");
        }
        return reciperepository.save(recipe);
    }


}

