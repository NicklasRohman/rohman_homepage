package pizza;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IPizzaRepository extends JpaRepository<PizzaIngredientsEntity, Long> {
}
