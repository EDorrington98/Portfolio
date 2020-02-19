package com.qa.chickrab;

public class Runner {
	public static void main(String[] args) {
		System.out.println("How many chicken and rabbits are there when there are 35 heads and 94 legs in total?" + chirab(35,94));
}
	public static String chirab(int h, int l) {
		int r = ((l-(2*h)) /2);
		int c = h - r;
		String chickrabs = (" " + r + " Rabbits" + " and " + c + " Chickens");
		return chickrabs;
	}
}
