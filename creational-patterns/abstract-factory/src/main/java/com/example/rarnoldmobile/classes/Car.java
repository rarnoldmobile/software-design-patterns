package com.example.rarnoldmobile.classes;

import com.example.rarnoldmobile.interfaces.Vehicle;

public class Car implements Vehicle {

	public void start() {
		System.out.println("Starting the vehicle");
		
	}
	
	public void testCar() {
		System.out.println("I am specific to car");
	}

}
