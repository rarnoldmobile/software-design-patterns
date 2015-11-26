package com.example.rarnoldmobile;

import com.example.rarnoldmobile.classes.*;
import com.example.rarnoldmobile.factory.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BaseFactory vehicleFactory = ManagerFactory.getFactory("vehicle");
        Car car = (Car) vehicleFactory.getVehicle("car");
        
        car.start();
        car.testCar();
        
        Truck truck = (Truck) vehicleFactory.getVehicle("truck");
        truck.start();
        truck.testTruck();
    }
}
