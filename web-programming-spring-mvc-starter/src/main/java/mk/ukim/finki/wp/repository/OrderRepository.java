package mk.ukim.finki.wp.repository;

import mk.ukim.finki.wp.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by k1ko on 12/2/15.
 */
public interface OrderRepository {

	Order findById(Long id);
    List<Order> findAll();
	void save(Order o);
	void delete(Order byId);
}
