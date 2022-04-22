package de.tj.crash.pizzabestellservice.commons;

import java.util.Arrays;
import java.util.List;

import de.tj.crash.pizzabestellservice.commons.enums.Toppings;

/***
 * 
 * Eine Klasse für eventuelle globale Hilfsmethoden
 * 
 *  */
public class Utility {
	
	public static Toppings getToppingByName(String name) {
		Toppings ret = Toppings.NONE;
		List<Toppings> tmp = Arrays.asList(ret.getDeclaringClass().getEnumConstants());
		for(Toppings s : tmp)
		{
			
			if(s.getName().equals(name)) {
//				System.out.println(s.getName());
				ret = s;
				break;
			}
			
		}
		
		return ret;
		
	}
	
	public static double getToppingPriceByName(String name) {
		double ret = 0d;
		for(Toppings t : Toppings.getAllToppings()) {
			if(t.getName().equals(name)) {
				ret = t.getPrice();
				break;
			}
		}
		return ret;
	}

}
