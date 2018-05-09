package mk.ukim.finki.wp.service;

import mk.ukim.finki.wp.model.Pizza;

import java.util.List;

/**
 * Created by k1ko on 11/21/15.
 */
public interface PizzaService {

    List<Pizza> getPizzaTypes();
    void create(Pizza pizza);
	Pizza findByType(String type);
	Pizza getPizza(Long id);
}
