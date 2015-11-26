package com.example.rarnoldmobile.classes;

import com.example.rarnoldmobile.interfaces.Vehicle;

public class Truck implements Vehicle {
	private String _initProcedure;
	
	public Truck(String initProcedure) {
		set_initProcedure(initProcedure);
	}
	public void start() {
		System.out.println("Truck is starting");
		
	}
	
	public void testTruck() {
		System.out.println("I am a truck");
	}
	
	public String get_initProcedure() {
		return _initProcedure;
	}
	
	public void set_initProcedure(String _initProcedure) {
		this._initProcedure = _initProcedure;
	}

}
