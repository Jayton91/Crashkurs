package de.tj.crash.pizzabestellservice.model;

import de.tj.crash.pizzabestellservice.commons.enums.Toppings;
import de.tj.crash.pizzabestellservice.model.base.BasePizza;

public class TonnoPizza extends BasePizza {
	public TonnoPizza() {
		super();
		setName("Pizza Tonno");
		addToppingsForTonnot();
		setPrice(calculatePrice());
	}
	
	private void addToppingsForTonnot() {
		addTopping(Toppings.OLIVE);
		addTopping(Toppings.FISH);
	}
}
