package com.revature.condtionalBlocks;

public class ConditionalBlocks {

	public static void main(String[] args) {
		boolean b = false;
		boolean firstCondition = true;
		boolean secondCondition = true;
		
		if(firstCondition) {
			System.out.println("Outside the if-statement");
			
			if(secondCondition) {
				System.out.println("inside the if-statement");
			}
		} else if (secondCondition) {
			System.out.println(5);
		}
		else {
			System.out.println("inside the else-statement");
		}
		
		if(b) {
			System.out.println("inside the if-statement");
			
		} else {
			System.out.println("inside the if-statement");
		}
		
		System.out.println("Outside the if-statement");
	}

}
