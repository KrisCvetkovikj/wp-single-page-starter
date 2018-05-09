package mk.ukim.finki.wp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by k1ko on 12/2/15.
 */

@Entity
@Table(name = "pizzas")
public class Pizza extends BaseEntity {

    public String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getId() {
		return getId();
	}

	public void setId(Long id) {
		setId(id);
	}
}
