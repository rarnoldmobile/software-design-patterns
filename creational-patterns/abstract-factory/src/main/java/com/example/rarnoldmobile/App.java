package com.example.rarnoldmobile;

import com.example.rarnoldmobile.classes.*;
import com.example.rarnoldmobile.factory.*;
import com.example.rarnoldmobile.interfaces.Vehicle;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BaseFactory vehicleFactory = ManagerFactory.getFactory("vehicle");
        Vehicle car = (Car) vehicleFactory.getVehicle("car");
        
        car.start();
        
        Vehicle truck = vehicleFactory.getVehicle("truck");
        truck.start();
    }
}
