//package myapp.Mr.chef;
//
//
//import myapp.Mr.chef.model.Recipe;
//import myapp.Mr.chef.repository.RecipeRepository;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ContextConfiguration;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//
//@SpringBootTest
//public class ApplicationTests {
//	@Autowired
// private RecipeRepository recipeRepository;
//	@Test
//	void contextLoads() {
//	}
//	@Test
//	void createrecipe(){
//		 Recipe res = new Recipe();
//		res.setId(101);
//		res.setFoodName("biryani");
//		res.setIngredients("300g basmati rice," +
//				"2.25g butter," +
//
//				"3.1 large onion," +
//				"" +
//				",4. finely sliced," +
//				"5. 1 bay leaf," +
//				"6. 3 cardamom pods," +
//				"7. small cinnamon stick," +
//				"8. 1 tsp turmeric," +
//				"" +
//				"9. 4 skinless chicken breasts, cut into large chunks," +
//				"4 tbsp curry paste (we used Patak's balti paste)," +
//				"85g raisins," +
//				"850ml chicken stock," +
//				"30g coriander, ½ chopped, ½ leaves picked and 2 tbsp toasted flaked almonds, to serve");
//		res.setMethod("#1.Soak 300g basmati rice in warm water, then wash in cold until the water runs clear.," +
//				"," +
//				"#2.Heat 25g butter in a saucepan and cook 1 finely sliced large onion with 1 bay leaf, 3 cardamom pods and 1 small cinnamon stick for 10 mins.," +
//				"" +
//				"#3Sprinkle in 1 tsp turmeric, then add 4 chicken breasts, cut into large chunks, and 4 tbsp curry paste. Cook until aromatic.," +
//				"" +
//				"#5.Stir the rice into the pan with 85g raisins, then pour over 850ml chicken stock.," +
//				"" +
//				"#6.Place a tight-fitting lid on the pan and bring to a hard boil, then lower the heat to a minimum and cook the rice for another 5 mins.," +
//				"" +
//				"Turn off the heat and leave for 10 mins. Stir well, mixing through 15g chopped coriander. To serve, scatter over the leaves of the remaining 15g coriander and 2 tbsp toasted almonds. ");
//
//		res.setId(102);
//		res.setFoodName("Chicken noodle soup");
//		res.setIngredients("900ml chicken," +
//				"" +
//				" or vegetable stock (or Miso soup mix)," +
//				"1 boneless, skinless chicken breast, about 175g/6oz," +
//				"1 tsp chopped fresh root ginger," +
//				"1 garlic clove, finely chopped," +
//				"50g rice," +
//				"" +
//				" or wheat noodles," +
//				"2 tbsp sweetcorn," +
//				"" +
//				", canned or frozen," +
//				"2-3 mushrooms," +
//				"" +
//				", thinly sliced," +
//				"2 spring onions," +
//				"" +
//				", shredded," +
//				"2 tsp soy sauce," +
//				"" +
//				", plus extra for serving," +
//				"mint," +
//				"" +
//				" or basil leaves and a little shredded chilli (optional), to serve");
//		res.setMethod("Pour 900ml chicken or vegetable stock into a pan and add 1 boneless, skinless chicken breast, 1 tsp chopped root ginger and 1 finely chopped garlic clove.," +
//				"" +
//				"Bring to the boil, then reduce the heat, partly cover and simmer for 20 mins, until the chicken is tender.," +
//				"" +
//				"Remove the chicken to a board and shred into bite-size pieces using a couple of forks.," +
//				"" +
//				"Return the chicken to the stock with 50g rice or wheat noodles, 2 tbsp sweetcorn, 2-3  thinly sliced mushrooms, 1 shredded spring onion and 2 tsp soy sauce." +
//				"" +
//				"Simmer for 3-4 mins until the noodles are tender.," +
//				"" +
//				"Ladle into two bowls and scatter over the remaining shredded spring onion, mint or basil leaves and shredded chilli if using. Serve with extra soy sauce for sprinkling.");
//
// res.setId(103);
// res.setFoodName("South Indian aloo masala");
// res.setIngredients("4 tbsp vegetable oil," +
//		 "1 tsp mustard seeds," +
//		 "10-15 curry leaves," +
//		 "¼ tsp asafoetida," +
//		 "" +
//		 "1 onion," +
//		 "" +
//		 ", thinly sliced," +
//		 "1 heaped tbsp tomato purée," +
//		 "3 tsp sambar masala mixed with ¼ cup water," +
//		 "4 large potatoes," +
//		 "" +
//		 ", boiled and cut into bite size chunks," +
//		 "handful fresh coriander, finely chopped");
// res.setMethod("Heat the oil in a pan over a medium heat. Fry the mustard seeds, curry leaves and asafoetida until they begin to crackle, then add the onions. Cook for 3-4 mins until the onions are slightly golden." +
//		 "\n" +
//		 "Stir in the tomato purée along with the diluted sambar masala. Tip in the potatoes, 1¼ tsp of salt and mix well. Lightly crush the potatoes with a wooden spoon and cook for a further 3-4 mins. Taste for seasoning. Serve garnished with the coriander.");
//
//
//
//
//		recipe saverecipe= recipeRepository.save(res);
//		System.out.println(saverecipe);
//
//
//
//		Assertions.assertEquals(res.getId(),saverecipe.getId());
//		Assertions.assertEquals(res.getFoodName(),saverecipe.getFoodName());
//		Assertions.assertEquals(res.getIngredients(),saverecipe.getIngredients());
//		Assertions.assertEquals(res.getMethod(),saverecipe.getMethod());
//	}
// @Test
//
//	void readrecipe() {
//		Iterable<recipe> recipeIterable =recipeRepository.findAll();
//		List<recipe> recipeList = new ArrayList<>();
//
//		recipeIterable.forEach(recipeList::add);
//
//		System.out.println(recipeList);
//
//	}
// @Test
//	void readbyid() {
//		Optional<recipe> optionalRecipe = recipeRepository.findById(101L);
//
//
//		recipe r= optionalRecipe.get();
//		System.out.println(r);
//	}
//
//}
