package myapp.Mr.chef.controller;


import myapp.Mr.chef.exception.ResourceNotFoundException;
import myapp.Mr.chef.model.recipe;
import myapp.Mr.chef.service.recipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("cook")
public class recipeController {
    private recipeService recipeService;

    public recipeController(myapp.Mr.chef.service.recipeService recipeService) {
        this.recipeService = recipeService;
    }
        @GetMapping("")
    public String sayHellow(){

        return " Wellcome ..." +
                "follow the code and type in adress bar (/code number)......" +
                "" +
                "" +
                "" +
                "biryani=101," +
                "Chicken noodle soup=102," +
                "South Indian aloo masala=103"
                ;

    }





    @GetMapping("/{id}")
    public ResponseEntity<recipe> getStudent(@PathVariable long id) {
        try {
            recipe re = recipeService.findById(id);
            return ResponseEntity.ok(re);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
