package com.qa.armstrong;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		System.out.println("What are all the armstrong numbers up to 1000?" + armstrong(1000));
	}

	static boolean isArmstrong(int num) {
		char[] intChars = Integer.toString(num).toCharArray();
		List<Integer> nums = new ArrayList<>();
		for (char c : intChars) {
			nums.add(Character.getNumericValue(c));
		}
		int total = 0;
		for (Integer unit : nums) {
			total += (unit * unit * unit);
		}
		return (num == total);
	}

	static List<Integer> armstrong(int maxNum) {
		List<Integer> armstrongs = new ArrayList<>();
		for (int i = 1; i <= maxNum; i++) {
			if (isArmstrong(i))
				armstrongs.add(i);
			
		}
		return armstrongs;}
}
