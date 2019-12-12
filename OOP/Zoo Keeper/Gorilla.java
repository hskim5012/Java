package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {

	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		this.energy-=5;
		System.out.println("The gorilla has thrown something");	
	}
	
	public void eatBananas() {
		this.energy+=10;
		System.out.println("Gorilla is satisfied");
		
	}
	
	public void climb() {
		this.energy-=10;
		System.out.println("Gorilla climbed the tree");
	}
	
}
