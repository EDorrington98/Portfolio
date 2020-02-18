package com.qa.find;
public class Runner {

	public static void main(String[] args) {
		System.out.println("Is 'l' in the word 'waffle' at the 5th position?" + find("waffle",5,'l'));
		System.out.println("Is 'x' in the word 'roman' at the 1st position?" + find("roman",1,'x'));
		
	}
	
		public static boolean find(String s, int i, char c) {
			return (s.charAt(i-1)==c);
		}

	}


