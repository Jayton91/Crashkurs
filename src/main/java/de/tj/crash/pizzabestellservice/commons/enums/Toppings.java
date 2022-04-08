package de.tj.crash.pizzabestellservice.commons.enums;

/**
 * Enums! Gut zu wissen, wie sie funktionieren. Allerdings sind sie hier komplexer als in c/c++
 *
 */
public enum Toppings {
	
	PEPPERONI(1L, "Pepperoni"), CHEESE(2L,"Käse"), TOMATOESAUCE(3L,"Tomatensoße");

	private String name;
	private long value;
	
	private Toppings(long value, String name) {
		this.name = name;
		this.value= value;
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
	
	
}
