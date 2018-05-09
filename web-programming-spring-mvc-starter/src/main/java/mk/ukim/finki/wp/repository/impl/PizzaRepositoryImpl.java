package mk.ukim.finki.wp.repository.impl;

import mk.ukim.finki.wp.model.Order;
import mk.ukim.finki.wp.model.Pizza;
import mk.ukim.finki.wp.repository.BaseRepository;
import mk.ukim.finki.wp.repository.PizzaRepository;
import mk.ukim.finki.wp.repository.helper.PredicateBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by k1ko on 12/2/15.
 */
@Repository
public class PizzaRepositoryImpl implements PizzaRepository {

	@Autowired
	BaseRepository baseRepository;

	public Pizza findById(Long id) {
		return baseRepository.getById(Pizza.class, id);
	}

	public List<Pizza> findAll() {
		return baseRepository.findAll(Pizza.class);
	}

	public void save(Pizza p) {
		baseRepository.store(p);
	}

	public void delete(Pizza byId) {
		baseRepository.delete(Pizza.class, byId.getId());
	}

	public Pizza findByType(final String type) {
		return (Pizza) baseRepository.findSingle(Pizza.class, new PredicateBuilder<Pizza>() {
			public Predicate toPredicate(CriteriaBuilder criteriaBuilder, CriteriaQuery<Pizza> criteriaQuery, Root<Pizza> root) {
				return criteriaBuilder.equal(root.get("type"), type);
			}
		});
	}
}
