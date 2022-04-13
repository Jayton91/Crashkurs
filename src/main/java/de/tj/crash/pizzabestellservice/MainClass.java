package de.tj.crash.pizzabestellservice;

import de.tj.crash.pizzabestellservice.commons.Utility;
import de.tj.crash.pizzabestellservice.commons.enums.Toppings;
import de.tj.crash.pizzabestellservice.controller.Controller;
import de.tj.crash.pizzabestellservice.view.View;

/**
 * Die Main steuert ja den Programmablauf. Beachte: Sie kennt nur die Anzeige und nen Controller.
 * Der Controller leitet alle Anfragen an die entsprechenden Stellen weiter und gibt nur das nötigste zurück:
 * Hier wird zB kein Model benötigt.
 * 
 * Generell: Pattern MVC - Model-View-Controller: Controller kennt model, view und Logik
 * Model kennt nur Controller
 * Logik kennt nur controller
 * view kennt nur controller
 * 
 * wenn irgendwas berechnet/angefragt werden soll, muss alles über den controller laufen!
 * 
 * PS. mit logik sind komplexere Dinge wie Berechnungen oder so gemeint. Hier (noch?) leer
 *
 */
public class MainClass {
	private static View view;
	private static Controller controller;

	public static void main(String[] args) {
		initSystem();
		
		Toppings t = Utility.getToppingByName(Toppings.CHEESE.getName());
		
		view.printGreeting();
		view.printMenu();
		view.takeAndPrintOrder();
		
	}
	
	static void initSystem() {
		controller = new Controller();
		view = new View(controller);
	}
}
