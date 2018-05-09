package mk.ukim.finki.wp.repository.impl;

import mk.ukim.finki.wp.model.Order;
import mk.ukim.finki.wp.repository.BaseRepository;
import mk.ukim.finki.wp.repository.OrderRepository;
import mk.ukim.finki.wp.repository.helper.PredicateBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by k1ko on 12/2/15.
 */
@Repository
public class OrderRepositoryImpl implements OrderRepository {

	@Autowired
	private BaseRepository baseRepository;

	public Order findById(Long id) {
		return baseRepository.getById(Order.class, id);
	}

	public List<Order> findAll() {
		return baseRepository.findAll(Order.class);
	}

	public void save(Order o) {
		baseRepository.store(o);
	}

	public void delete(Order order) {
		baseRepository.delete(Order.class, order.getId());
	}
}
