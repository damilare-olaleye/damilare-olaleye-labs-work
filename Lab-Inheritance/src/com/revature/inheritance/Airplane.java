package com.revature.inheritance;

public class Airplane extends FlyingVehicle {

	private short wheels;
	private short propellers;
	
	public Airplane(short wheels, short propellers) {
		this.wheels = wheels;
		this.propellers = propellers;
	}

	// setters
	public void setWheels(short wheels) {
		this.wheels = wheels;
	}

	public void setProperllers(short propellers) {
		this.propellers = propellers;
	}

	//getters
	public short getWheels() {
		return this.wheels;
	}

	public short getPropellers() {
		return this.propellers;
	}

	public void turn() {
		System.out.println("Turning;;;;;");
	}

}
