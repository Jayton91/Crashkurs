package de.tj.crash.pizzabestellservice.commons.enums;

import java.util.Arrays;
import java.util.List;

/**
 * Enums! Gut zu wissen, wie sie funktionieren. Allerdings sind sie hier komplexer als in c/c++
 *
 */
public enum Toppings {
	
	PEPPERONI(1L, "Pepperoni",1d), CHEESE(2L,"Käse",1d), TOMATOESAUCE(3L,"Tomatensoße",1d), NONE(4L,"Ohne",0d);

	private String name;
	private long value;
	private double price;
	
	private Toppings(long value, String name, double price) {
		this.name = name;
		this.value= value;
		this.price=price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	
	
	
}
