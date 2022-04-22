package de.tj.crash.pizzabestellservice.commons.enums;

import java.util.Arrays;
import java.util.List;

/**
 * Enums! Gut zu wissen, wie sie funktionieren. Allerdings sind sie hier komplexer als in c/c++
 *
 */
public enum Toppings {
	
	PEPPERONI(1L, "Pepperoni",3.0), CHEESE(2L,"Käse",1.5), TOMATOESAUCE(3L,"Tomatensoße",0.5), NONE(4L,"Ohne",0d), MUSHROOM(5L, "Pilze", 3.0), OLIVE(6L, "Oliven", 0.8), FISH(7L, "Thunfisch", 4.20);

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
	
	public static List<Toppings> getAllToppings(){
		return Arrays.asList(PEPPERONI.getDeclaringClass().getEnumConstants());
	}
	
	
	
	
}
