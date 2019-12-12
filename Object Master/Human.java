package com.codingdojo.objectmaster;

public class Human {
	
	int strength;
	int stealth;
	int intelligence;
	int health;

	public Human() {
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}
	
	public int getHealth() {
		System.out.println("My current health is " + this.health);
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void attack(Human target) {
		this.health -= this.strength;
	}
}
