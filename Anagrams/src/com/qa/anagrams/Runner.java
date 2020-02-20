package com.qa.anagrams;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
	System.out.println("Are 'devil' and 'angel' anagrams of eachother? " + anagrams("devil" , "angel"));
	System.out.println("Are 'evil' and 'vile' anagrams of eachother? " + anagrams("evil" , "vile"));
	}
	static boolean anagrams(String a, String b) {
		

		char [] asort = a.toCharArray();	
		Arrays.sort(asort);
		char [] bsort = b.toCharArray();	
		Arrays.sort(bsort);

		
		return Arrays.equals(asort, bsort);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
