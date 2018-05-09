package mk.ukim.finki.wp.model;

import org.hibernate.annotations.Cascade;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

/**
 * Created by k1ko on 11/21/15.
 */
@Entity
@Table(name = "orders")
public class Order extends BaseEntity {

/*
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long orderId;
*/

    public String clientName;
    public String clientAddress;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "pizza_id")
	private Pizza pizza;

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
}
