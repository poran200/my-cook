package myapp.Mr.chef.repository;

import myapp.Mr.chef.model.recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface recipeRepository extends CrudRepository<recipe, Long> {

}
