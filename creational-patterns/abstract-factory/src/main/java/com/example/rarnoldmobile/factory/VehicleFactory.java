package com.example.rarnoldmobile.factory;

import com.example.rarnoldmobile.classes.Car;
import com.example.rarnoldmobile.classes.Truck;
import com.example.rarnoldmobile.interfaces.Vehicle;

public class VehicleFactory extends BaseFactory {

	@Override
	public
	Vehicle getVehicle(String vehicle) {
		
		if (vehicle == null) {
			return null;
		}
		
		if (vehicle.equalsIgnoreCase("CAR")) {
			return new Car();
		}
		
		if (vehicle.equalsIgnoreCase("TRUCK")) {
			
			return new Truck("hidden init");
		}
		
		return null;
	}


}
