package myapp.Mr.chef.controller;


import myapp.Mr.chef.exception.RecourseAlreadyExist;
import myapp.Mr.chef.exception.ResourceNotFoundException;
import myapp.Mr.chef.model.Recipe;
import myapp.Mr.chef.service.recipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cook")
public class recipeController {
    private recipeService recipeService;

    public recipeController(myapp.Mr.chef.service.recipeService recipeService) {
        this.recipeService = recipeService;
    }
    @GetMapping("")
    public List<Recipe> getAll(){
        return recipeService.findAll();
    }





    @GetMapping("/{id}")
    public ResponseEntity<Recipe> getStudent(@PathVariable long id) {
        try {
            Recipe re = recipeService.findById(id);
            return ResponseEntity.ok(re);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping("/recipe")
    public ResponseEntity<Recipe> saveRecipe(@RequestBody Recipe recipe){
         try {
             return ResponseEntity.ok(recipeService.create(recipe));
         } catch (RecourseAlreadyExist recourseAlreadyExist) {
             return  ResponseEntity.badRequest().build();
         }
    }

}
