package com.codingdojo.zookeeper;

public class Mammal {
	int energy;
	
	public Mammal() {
		this.energy = 100;
	}
	
	public int displayEnergy() {
		System.out.println("My current energy is " +energy);
		return energy;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
}
