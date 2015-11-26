package com.example.rarnoldmobile.classes;

import com.example.rarnoldmobile.interfaces.Vehicle;

public class Car implements Vehicle {

	public void start() {
		this.testCar();
		
	}
	
	private void testCar() {
		System.out.println("I am specific to car");
	}

}
