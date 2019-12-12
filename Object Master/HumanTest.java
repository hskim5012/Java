package com.codingdojo.objectmaster;

public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();
		Human h2 = new Human();
		h.attack(h2);
		h.getHealth();
		Wizard w = new Wizard();
		w.heal(h);
		h.getHealth();
		w.fireball(h);
		h.getHealth();
		Ninja n = new Ninja();
		n.steal(h);
		n.runAway();
		h.getHealth();
		n.runAway();
		n.getHealth();
		Samurai s = new Samurai();
		s.medidate();
		s.howMany();
		s.getHealth();
		s.deathBlow(h2);
		s.getHealth();
		h2.getHealth();
		
	}
}
