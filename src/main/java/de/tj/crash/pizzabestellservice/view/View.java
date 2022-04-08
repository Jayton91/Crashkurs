package de.tj.crash.pizzabestellservice.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.tj.crash.pizzabestellservice.controller.Controller;
import de.tj.crash.pizzabestellservice.model.PepperoniPizza;
import de.tj.crash.pizzabestellservice.model.base.BasePizza;
import de.tj.crash.pizzabestellservice.model.base.Order;

/**
 * Die View regelt alles, was mit dem "UI" zu tun hat (naja, hier halt Textbasiert).
 * Merke: Die UI ist dumm. Sie kann nur anzeigen. Für alles weitere zieht sie den Controller zu Rate (Pattern: Model-View-Controller)
 */
public class View {
	
	private Map<Integer,String> menuMap; //kleine Einführung in Maps
	private final List<String> menuList = new ArrayList<String>(Arrays.asList("Pizza Margherita","Pepperoni Pizza")); //Listen sind wichtig!
	private final StringBuilder sb=new StringBuilder();
	private Controller controller;
	
	public View(Controller controller) {
		this.controller = controller;
		
		menuMap = new HashMap<Integer,String>();
		for(int i = 0; i< menuList.size(); i++) { //for-Loop style1
			menuMap.put(i+1, menuList.get(i));
		}
	}
	
	public String getMenu() {
		sb.append("Bitte wählen sie aus dem folgenden Menü etwas aus:");
		for(Integer key : menuMap.keySet()) { //for-loop style 2
			sb.append("\nDrücken sie die " + key + " für eine " + menuMap.get(key));
		}
		
		return sb.toString();
		
	}
	
	public void printMenu() {
		System.out.println(getMenu());
	}
	
	public void takeAndPrintOrder() {
		String ret="Sie haben folgendes bestellt:\n";
		int singleOrderNumber=-1;
		
		try {
			singleOrderNumber= controller.takeOrder();
		} catch (IOException e) {//exception wird vom controller hierhin geworfen; hier wird sie dann behandelt.
			System.out.println("Ich habe Sie leider nicht verstanden. Bitte versuchen sie es erneut.");
		}
		ret += generateOrderedString(singleOrderNumber);
		System.out.println(ret);;
	}
	
	private String generateOrderedString(int singleOrderNumber) {
		Order order;
		//switch-cases ;)
		switch (singleOrderNumber) {
		case 2:
			order = new PepperoniPizza();
			break;

		default:
			order = new BasePizza();
			break;
		}
		
		return order.orderAsString();
	}
	
	public void printGreeting(){
		
		System.out.println("Willkommen bei TJ's CrashPizza!");
    }

}
