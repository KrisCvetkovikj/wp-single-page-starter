package mk.ukim.finki.wp.service;

import mk.ukim.finki.wp.model.Order;
import mk.ukim.finki.wp.model.Pizza;

import java.util.List;

/**
 * Created by k1ko on 11/21/15.
 */

public interface OrderService {

    Order placeOrder(Order o);
    List<Order> listOrders();
	Order getOrder(Long id);
}
