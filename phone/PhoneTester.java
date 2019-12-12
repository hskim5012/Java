package com.codingdojo.phone;

public class PhoneTester {
	public static void main(String[] args) {
		iPhone apple = new iPhone("X", 100, "ATT", "Zing");
		apple.displayInfo();
		System.out.println(apple.unlock());
		Galaxy samsung = new Galaxy("S9", 55, "Verizon", "Ring Ring Ring");
		samsung.displayInfo();
		System.out.println(samsung.getRingTone());
	}

}
