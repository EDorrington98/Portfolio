package com.qa.primenumbers;

public class Runner {

	public static void main(String[] args) {
		System.out.println("How many prime numbers are there up to the number 4010? " + primeNumbers(4010));
	}
	static int primeNumbers(int max) {	
		int primeCounter = 0;
		for (int i=2; i<=max; i++) {
			boolean isPrime = true;
			for(int j=2; j<= (int)Math.sqrt(i); j++) {
				if (i%j==0) {
					isPrime=false;
					break;
				}
			}
				if(isPrime) {
					primeCounter += 1;
				}
			
			}
		return primeCounter;
	}
	}

