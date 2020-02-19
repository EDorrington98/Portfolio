package com.qa.unique;

import java.util.LinkedHashSet;
import java.util.Set;

public class Runner {
	public static void main(String[] args) {
		System.out.println("What are the unique letters in 'waffle'?" + uniqueLetters("waffle"));
	}
public static String uniqueLetters (String sentence) {
	Set <Character> uniqueLetterList = new LinkedHashSet <Character> ();
	String uniqueLetters = "";
	for (int i=0; i<sentence.length(); i++) {
		uniqueLetterList.add(sentence.charAt(i));
	}
	for (char c: uniqueLetterList) {
		uniqueLetters = uniqueLetters+c;
	}
	return uniqueLetters;
}

}
