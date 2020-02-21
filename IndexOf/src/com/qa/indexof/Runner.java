package com.qa.indexof;

public class Runner {

			public static void main(String[] args) {
				System.out.println("What position is the letter 'g' in the sentence 'I scored three goals today'?\n"
						+ indexOf('g', "I scored three goals today"));

			}

			static int indexOf(char c, String sentence) {
				char[] thing = sentence.toCharArray();
				int pos = -1;
				for (int i = 0; i < sentence.length(); i++) {
					if (c == thing[i]) {
						pos = i;
					}
				}
				return pos;
			}

		
	}


