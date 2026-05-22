package pizza;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PizzaService implements IPizzaService {

    List<PizzaEntity> pizzaDBS = new ArrayList<>();
    List<PizzaIngredientsEntity> pizzaIngredientsDBS = new ArrayList<>();

    private IPizzaRepository pizzaRepository;

    @Override
    public List<PizzaIngredientsEntity> getAllPizzaIngredients() {

        return pizzaIngredientsDBS;
    }

    @Override
    public PizzaIngredientsEntity getPizzaIngredientByName(String name) {

        PizzaIngredientsEntity result =  pizzaIngredientsDBS.stream().filter(x -> x.getName().equals(name)).findFirst().orElse(null);

        if (result == null) {
            return null;
        }

    return result;
    }

    @Override
    public List<PizzaIngredientsEntity> addPizzaIngredient(PizzaIngredientsEntity pizzaIngredientsEntity) {
        pizzaIngredientsDBS.add(pizzaIngredientsEntity);
        return pizzaIngredientsDBS;
    }

    @Override
    public List<PizzaIngredientsEntity> deletePizzaIngredient(String name) {
        pizzaIngredientsDBS.removeIf(x -> x.getName().equals(name));

        return pizzaIngredientsDBS;
    }

    @Override
    public List<PizzaIngredientsEntity> editPizzaIngredient(PizzaIngredientsEntity pizzaIngredientsEntity) {

        pizzaIngredientsDBS.stream().filter(x -> x.getName().equals(pizzaIngredientsEntity.getName())).findFirst().orElse(null);


        return pizzaIngredientsDBS;
    }
}
