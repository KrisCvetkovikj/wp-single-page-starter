package mk.ukim.finki.wp.service.impl;

import mk.ukim.finki.wp.model.Pizza;
import mk.ukim.finki.wp.repository.PizzaRepository;
import mk.ukim.finki.wp.repository.impl.PizzaRepositoryImpl;
import mk.ukim.finki.wp.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by k1ko on 11/21/15.
 */

@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public List<Pizza> getPizzaTypes() {
		return pizzaRepository.findAll();
    }

    public void create(Pizza pizza) {
        pizzaRepository.save(pizza);
    }

	public Pizza findByType(String type) {
		return pizzaRepository.findByType(type);
	}

	public Pizza getPizza(Long id) {
		return pizzaRepository.findById(id);
	}
}
