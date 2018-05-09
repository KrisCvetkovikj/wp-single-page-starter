package mk.ukim.finki.wp.repository;

import mk.ukim.finki.wp.model.Order;
import mk.ukim.finki.wp.model.Pizza;

import java.util.List;

/**
 * Created by k1ko on 12/2/15.
 */
public interface PizzaRepository {

	Pizza findById(Long id);
	List<Pizza> findAll();
	void save(Pizza p);
	void delete(Pizza byId);
	public Pizza findByType(String type);
}
