package de.tj.crash.pizzabestellservice.model.base;

import java.util.ArrayList;
import java.util.List;

import de.tj.crash.pizzabestellservice.commons.Utility;
import de.tj.crash.pizzabestellservice.commons.enums.Toppings;

/**
 * Die Pizza-Basisklasse. Jede Pizza ist auch eine Grundpizza! Und jede
 * Grundpizza ist ein Order. Hier eine weitere Aufgabe: Ich möchte in meiner
 * Pizzeria auch Croques anbieten!
 *
 */
public class BasePizza implements Order {

	private String name;
	private double price;
	private List<String> toppings;

	public BasePizza(String name, double price) {
		this.name = name;
		this.price = price;
		this.toppings = new ArrayList<String>();
		addTopping(Toppings.CHEESE);
		addTopping(Toppings.TOMATOESAUCE);

	}

	// Standardkonstruktor, der einfach mal die Dinge selbst ermittelt.
	public BasePizza() {
		this.name = "Pizza Margherita";

		this.toppings = new ArrayList<String>();
		addTopping(Toppings.CHEESE);
		addTopping(Toppings.TOMATOESAUCE);
		this.price = calculatePrice();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<String> getToppings() {
		return toppings;
	}

	public void setToppings(List<String> toppings) {
		this.toppings = toppings;
	}

	public void addTopping(Toppings topping) {
		this.toppings.add(topping.getName());
	}

	@Override
	public double calculatePrice() {
		// TODO eine Aufgabe: Preis einberechnen.
		// Jedes Topping soll einen Preis erhalten, woraus sich der Preis der Pizza
		// zusammenstellt.
		// aktuell bietet die Preisberechnung nur den Basispreis

		double price = 0.0;

		for (String t : toppings) {
			price += Utility.getToppingPriceByName(t);
		}

		return price;

	}

	@Override
	public String orderAsString() {
		// Eine kleine Einführung in die Nutzung eines StringBuilders. Ist effizienter,
		// performanter(?) und umfangreicher als
		// reine String-generierung
		StringBuilder sb = new StringBuilder();
		sb.append("Pizza: ").append(name + "\n");
		sb.append("Mit ");
		for (int i = 0; i < toppings.size(); i++) {
			if (i < toppings.size() - 1) {
				sb.append(toppings.get(i) + ", ");
			} else {
				int len = sb.length();
				sb.deleteCharAt(len - 2);
				sb.append("und " + toppings.get(i));
			}

		}
//		for (String s : toppings) {
////			sb.append("\n").append(s);
//			sb.append(s + ", ");
//		}
		sb.append("\nPreis: ").append(price).append(" €");
		return sb.toString();
	}

}
