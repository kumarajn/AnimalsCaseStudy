package com.animal.model;

public class Chicken extends Bird implements AnimalSound {

	
	
	public void fly() {
		throw new UnsupportedOperationException("cannot fly");
	}
	
	@Override
	public void makeSound() {
		
		System.out.println("Cluck, cluck");
	}
}
