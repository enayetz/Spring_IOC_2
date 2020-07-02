package com.nt.ioc2;

public class Car {
	
	private String carName;
	private Engine engName;
	
	
	public Car() {
		System.out.println("car constructor");
	}
	
	public void initCar() {
		System.out.println("init car");
	}
	
	public void destroyCar() {
		System.out.println("destroy car");
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public void setEngName(Engine engName) {
		this.engName = engName;
	}
	
	public void display() {
		System.out.println("car name: " + carName + " Engine name: " + engName.getEngineModel());
	}

}
