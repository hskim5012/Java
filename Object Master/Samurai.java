package com.codingdojo.objectmaster;

public class Samurai extends Human {
	
	private int army = 0;
	
	public Samurai() {
		super();
		this.health = 200;
		army += 1;
	}
	
	public void deathBlow(Human target) {
		target.health = 0;
		this.health /= 2;
	}
	
	public void medidate() {
		this.health *= 1.5;
	}
	
	public void howMany() {
		System.out.println("This many samurais in the army " +army);
		
	}
}
