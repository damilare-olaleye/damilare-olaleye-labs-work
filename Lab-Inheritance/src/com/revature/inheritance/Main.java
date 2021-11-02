package com.revature.inheritance;

public class Main {

	public static void main(String[] args) {
		FlyingVehicle fv = new FlyingVehicle();
		
		fv.setName("RoadStar Flying Vechile");
		System.out.println(fv.getName());

		Airplane boeing = new Airplane((short)15, (short)9);
		boeing.move(15);
	}

}
