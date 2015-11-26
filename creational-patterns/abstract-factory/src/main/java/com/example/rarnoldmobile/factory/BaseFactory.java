package com.example.rarnoldmobile.factory;

import com.example.rarnoldmobile.interfaces.Vehicle;

public abstract class BaseFactory {
	
	public abstract Vehicle getVehicle(String vehicle);

}
