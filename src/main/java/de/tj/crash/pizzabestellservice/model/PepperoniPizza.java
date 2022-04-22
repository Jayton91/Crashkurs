package de.tj.crash.pizzabestellservice.model;

import de.tj.crash.pizzabestellservice.commons.enums.Toppings;
import de.tj.crash.pizzabestellservice.model.base.BasePizza;
/**
 * Jede Pepperoni-Pizza ist auch zugleich eine Grundpizza - nur mit mehr Zutaten!
 *
 */
public class PepperoniPizza extends BasePizza {

	public PepperoniPizza(String name, double price) {
		super(name, price); //auf jeden Fall immer als erstes super(); das ist der Konstruktor der BasePizza
		addToppingsForPeperroni();
	}
	
	public PepperoniPizza() {
		super();//auf jeden Fall immer als erstes super(); das ist der Konstruktor der BasePizza
		setName("Pepperoni Pizza"); //und anschließend alles neu überschreiben. Felder werden vererbt.
		addToppingsForPeperroni();
		setPrice(calculatePrice());
	}

	private void addToppingsForPeperroni() {
		addTopping(Toppings.PEPPERONI); //addToppings ist eine Methode der BasisPizza. Kann hier aufgerufen werden, weil alle Methoden vererbt werden!
		
	}
	
	

	
}
