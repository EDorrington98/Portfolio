package com.qa.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Return the 5th number in the fibonacci sequence: " + fibonacci(1));
		System.out.println("Return the 10th number in the fibonacci sequence: " + fibo(4974));

	}
/**
 * Using a recursive method to complete the task.
 */
	static int fibonacci(int num) {
		if (num == 0) {
			return 0;
		}else if (num == 1) {
			return 1;
		}
		return fibonacci(num-1) + fibonacci(num-2);
		}
/**
 *  uses a non-recursive method to complete the task.
 */
			static int fibo(int pos) {
			List<Integer> nums = new ArrayList<>();
			nums.add(0);
			nums.add(1);
			for (int i = 1; i <= (pos + 1); i++) {
				nums.add(nums.get(i) + nums.get(i - 1));
			}
			return nums.get(pos);
		}

	}
	

