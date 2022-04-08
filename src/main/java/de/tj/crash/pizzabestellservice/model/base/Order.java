package de.tj.crash.pizzabestellservice.model.base;

/**
 * Ein Interface, das zur Abstraktion dient. In Java ist eigentlich nur eine Vererbung möglich, durch INterfaces kann eine weitere
 * Ebene hinzugefügt werden.
 * In einem Interface werden nur die Methoden angegeben, die von den implementierenden Klassen ausgefüllt werden müssen.
 * Somit können verschiedene Klassen die Methoden verschieden implementieren, haben jedoch den selben "GrundTypen"
 * @author TJ
 *
 */
public interface Order {
	
	public double calculatePrice();
	
	public String orderAsString();
}
