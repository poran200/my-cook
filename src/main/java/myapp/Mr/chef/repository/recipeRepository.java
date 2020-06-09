package myapp.Mr.chef.repository;

import myapp.Mr.chef.model.recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface recipeRepository extends JpaRepository<recipe, Long> {

}
