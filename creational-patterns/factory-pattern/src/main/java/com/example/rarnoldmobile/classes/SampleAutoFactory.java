package com.example.rarnoldmobile.classes;

public class SampleAutoFactory extends AutoFactory {



	@Override
	protected Car makeCar() {
		Car car1 = new Car();
		car1.setName("test");
		return car1;
		
	}
	
	

}
