package mk.ukim.finki.wp.web;

import mk.ukim.finki.wp.model.Order;
import mk.ukim.finki.wp.model.Pizza;
import mk.ukim.finki.wp.service.OrderService;
import mk.ukim.finki.wp.service.PizzaService;
import mk.ukim.finki.wp.service.impl.OrderServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.jws.WebParam;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by k1ko on 11/21/15.
 */

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class PizzaOrderController {

    @Autowired
    private PizzaService pService;

    @Autowired
    private OrderService oService;

	static Logger log = Logger.getLogger(PizzaOrderController.class.getName());

    @RequestMapping(value = { "/", "/index", "/OrderPizza" }, method = RequestMethod.GET)
    public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("pizzas", pService.getPizzaTypes());
		//session.setAttribute("pizza_type", pizzaType);
		return mv;
    }

    @RequestMapping(value = "/DeliveryInfo", method = RequestMethod.GET)
    public ModelAndView showClientInfo(@RequestParam String pizzaType, HttpSession session) {

		ModelAndView mv = new ModelAndView("DeliveryInfo");

		session.setAttribute("pizzaType", pizzaType);

        return mv;
    }

    @RequestMapping(value = "/PlaceOrder", method = RequestMethod.POST)
    public ModelAndView placeOrder(@RequestParam String clientName, @RequestParam String clientAddress, HttpSession
            session) {

		String pizzaType = (String) session.getAttribute("pizzaType");

		Order order = new Order();

		order.setPizza(pService.findByType(pizzaType));
		order.setClientName(clientName);
		order.setClientAddress(clientAddress);
		order = oService.placeOrder(order);

		ModelAndView mv = new ModelAndView("ShowOrder");
		mv.addObject("order", order);
		return mv;
    }

	@RequestMapping(value = "/ViewPizzas", method = RequestMethod.GET)
	public ModelAndView listPizzaType() {
		ModelAndView mv = new ModelAndView("ListPizzas");
		mv.addObject("pizzas", pService.getPizzaTypes());
		return mv;
	}

    @RequestMapping(value = "/ViewPizzas", method = RequestMethod.POST)
    public ModelAndView listPizzaType(@RequestParam String pizzatype) {
        ModelAndView mv = new ModelAndView("ListPizzas");
		mv.addObject("pizzas", pService.getPizzaTypes());
		Pizza p = new Pizza();
		p.setType(pizzatype);
		pService.create(p);
        return mv;
    }

	@RequestMapping(value = "/AllOrders", method = RequestMethod.GET)
	public ModelAndView getOrders() {
		ModelAndView mv = new ModelAndView("AllOrders");
		mv.addObject("orders", oService.listOrders());
		return mv;
	}
}
