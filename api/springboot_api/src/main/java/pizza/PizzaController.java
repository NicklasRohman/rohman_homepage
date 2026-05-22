package pizza;

import org.springframework.http.ResponseEntity;
import org.springframework.transaction.support.ResourceTransactionManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pizza")
public class PizzaController {

    private IPizzaService pizzaService;

    public PizzaController(PizzaService pizzaService, ResourceTransactionManager resourceTransactionManager) {
        this.pizzaService = pizzaService;
    }

    @GetMapping(value = "/allIngredients")
    public ResponseEntity<List<PizzaIngredientsEntity>> getAllPizzaIngredients(){

        var result = pizzaService.getAllPizzaIngredients();

    return ResponseEntity.ok(result);
}
    @GetMapping(value = "/ingredientByName")
    public ResponseEntity<PizzaIngredientsEntity> getPizzaIngredientByName(String name){

        var result = pizzaService.getPizzaIngredientByName(name);

        return ResponseEntity.ok(result);
    }

    @PostMapping(value = "/ingredient")
    public ResponseEntity<List<PizzaIngredientsEntity>> addPizzaIngredient(@RequestBody PizzaIngredientsEntity pizzaIngredientsEntity){

        var result = pizzaService.addPizzaIngredient(pizzaIngredientsEntity);

        return ResponseEntity.ok(result);
    }

    @PutMapping(value = "/ingredient")
    public ResponseEntity<List<PizzaIngredientsEntity>> editPizzaIngredient(@RequestBody PizzaIngredientsEntity pizzaIngredientsEntity){

        var result =  pizzaService.editPizzaIngredient(pizzaIngredientsEntity);

        return ResponseEntity.ok(result);
    }

    @DeleteMapping(value = "/ingredientByName")
    public ResponseEntity<List<PizzaIngredientsEntity>> deletePizzaIngredient(@RequestBody String name){

        var result = pizzaService.deletePizzaIngredient(name);

        return ResponseEntity.ok(result);
    }

}
