package pizza;


import java.util.List;

public interface IPizzaService {

    List<PizzaIngredientsEntity> getAllPizzaIngredients();
    PizzaIngredientsEntity getPizzaIngredientByName(String name);
    List<PizzaIngredientsEntity> addPizzaIngredient(PizzaIngredientsEntity pizzaIngredientsEntity);
    List<PizzaIngredientsEntity> deletePizzaIngredient(String name);
    List<PizzaIngredientsEntity> editPizzaIngredient( PizzaIngredientsEntity pizzaIngredientsEntity);
}
