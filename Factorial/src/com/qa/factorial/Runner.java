package com.qa.factorial;

public class Runner {

	public static void main(String[] args) {
		System.out.println("factorial of 10: " + factorials(10));
		System.out.println("factorial of 6: " + factorials(6));

	}

	public static int factorials(int val) {
		int num = 1;
		
		while (val > 0) {
			num = num * val ;
			val--;
		}
		
		return num;
	}
}