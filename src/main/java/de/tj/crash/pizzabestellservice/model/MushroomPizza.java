package de.tj.crash.pizzabestellservice.model;

import de.tj.crash.pizzabestellservice.commons.enums.Toppings;
import de.tj.crash.pizzabestellservice.model.base.BasePizza;

public class MushroomPizza extends BasePizza {
	public MushroomPizza() {
		super();
		setName("Pizza Funghi");
		addToppingsForFunghi();
		setPrice(calculatePrice());
	}
	
	private void addToppingsForFunghi() {
		addTopping(Toppings.MUSHROOM);
	}
}
