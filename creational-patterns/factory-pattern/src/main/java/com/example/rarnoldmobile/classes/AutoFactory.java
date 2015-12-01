package com.example.rarnoldmobile.classes;



public abstract class AutoFactory {

	private Car currentCar;
	
	public AutoFactory() {
		Car car1 = makeCar();
		car1.setName("Mazda");
		this.currentCar = car1;
	}
		
	
	abstract protected Car makeCar();


	public Car getCurrentCar() {
		return currentCar;
	}


	public void setCurrentCar(Car currentCar) {
		this.currentCar = currentCar;
	}
}
