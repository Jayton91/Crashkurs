package de.tj.crash.pizzabestellservice.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {

	public int takeOrder() throws IOException {
		int i=-1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			i = Integer.parseInt(br.readLine());
		} catch (NumberFormatException nfe) {
			throw new IOException();//Exception weiter schmeißen, um sie wo anders zu behandeln.
		}
		
		return i;
	}
}
