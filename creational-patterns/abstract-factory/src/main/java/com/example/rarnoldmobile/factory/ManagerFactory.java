package com.example.rarnoldmobile.factory;

public class ManagerFactory {
	
	public static BaseFactory getFactory(String choice) {
		
		if (choice.equalsIgnoreCase("VEHICLE")) {
			return new VehicleFactory();
		}
		
		return null;
		
	}
}
