package com.revature.main;

public class Main {

	public static void main(String[] args) {
		Ball b1 = new Ball();
		Ball b2 = new Ball();

		// assign initial state to the Ball instances
		b1.size = "big";
		b1.color = "blue";
		b2.size = "small";
		b2.color = "green";
		
		// to invoke the bounce method
		b1.bounce();
		b2.bounce();
	}

}
