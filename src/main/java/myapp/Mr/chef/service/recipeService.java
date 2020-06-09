package myapp.Mr.chef.service;


import myapp.Mr.chef.exception.ResourceNotFoundException;
import myapp.Mr.chef.model.recipe;
import myapp.Mr.chef.repository.recipeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class recipeService {
    private final recipeRepository reciperepository;

    public recipeService(recipeRepository reciperepository) {
        this.reciperepository = reciperepository;
    }

    public List<recipe> findAll() {
        List <recipe> recipeList = new ArrayList<>();
        reciperepository.findAll().forEach(recipeList::add);
        return recipeList;
    }

    public recipe findById(long id) throws ResourceNotFoundException {
        recipe rep = reciperepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);

        return rep;


    }

}

