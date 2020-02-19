package com.qa.palindromes;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Is the word 'waffle' a palindrome?" + palindrome("waffle"));
		System.out.println("Are the words 'race car' a palindrome?" + palindrome("race car"));
		System.out.println("Are the words 'race car' a palindrome?" + palindrome("plasdkkdsalp"));
	}

	public static boolean palindrome(String sentence) {
		sentence = sentence.toLowerCase();
		String newThing = " ";
		for (char letter : sentence.toCharArray()) {
			if (letter != ' ') {
				newThing += letter;
			}
		}
		int halfLength = newThing.length() / 2;
		int length = newThing.length();
		for (int i = 1; i <= halfLength; i++) {
			if (newThing.charAt(i) == newThing.charAt(length - i)) {
				// then what mate
				i++;
			} else {
				return false;
			}
		}
		return true;

	}
}
