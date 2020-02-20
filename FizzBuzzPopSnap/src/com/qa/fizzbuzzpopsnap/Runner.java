package com.qa.fizzbuzzpopsnap;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Find the result of Fizz Buzz Pop Pop for 15" + fizzbuzzpopsnap(15));
	}

	static String fizzbuzzpopsnap (int num) {
	String result = "";
	if (num % 3 == 0) result += "Fizz";
	if (num % 5 == 0) result += "Buzz";
	if (num % 7 == 0) result += "Pop";
	if (num % 11 == 0) result += "Snap";
	if (result.equals("")) {
		result = String.valueOf(num);}
	return " " + result;
	}
}
