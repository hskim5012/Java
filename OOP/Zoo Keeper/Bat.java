package com.codingdojo.zookeeper;

public class Bat extends Mammal{
	
	public Bat() {
		this.energy = 300;
	}
	
	public void fly() {
		energy-=50;
		System.out.println("Supersonic");
	}
	
	public void eatHumans() {
		energy+=25;
		System.out.println("so-well, nevermind");
	}
	
	public void attackTown() {
		energy-=100;
		System.out.println("Town on fire");
	}
	
	
}
