package com.revature.inheritance;

public class FlyingVehicle extends Vehicle{
	
	private short wings;
	private Engine engine;
	
	public FlyingVehicle() {}

	//getters 
	public short getWings() {
		return this.wings;
	}
	public Engine getEngine() {
		return this.engine;
	}
	
	// and setters
	public void setWings(short wings) {
		this.wings = wings;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	// methods
	public void fly() {
		System.out.println("FlyingVehicle is flying...");
	}
	
	public void refuel() {
		System.out.println("FlyingVehicle is refueling...");
	}
	
	public void liftOff() {
		System.out.println("FlyingVehicle is liftingoff...");
	}
	
	public void land() {
		System.out.println("FlyingVehicle is landing...");
	}

}
