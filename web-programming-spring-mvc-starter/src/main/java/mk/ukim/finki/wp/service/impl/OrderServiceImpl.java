package mk.ukim.finki.wp.service.impl;

import mk.ukim.finki.wp.model.Order;
import mk.ukim.finki.wp.model.Pizza;
import mk.ukim.finki.wp.repository.OrderRepository;
import mk.ukim.finki.wp.repository.impl.OrderRepositoryImpl;
import mk.ukim.finki.wp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * Created by k1ko on 11/21/15.
 */

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public Order placeOrder(Order o) {
		orderRepository.save(o);
		return o;
	}

	public List<Order> listOrders() {
		return orderRepository.findAll();
	}

	public Order getOrder(Long id) {
		return orderRepository.findById(id);
	}
}
