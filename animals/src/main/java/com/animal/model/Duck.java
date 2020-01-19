package com.animal.model;

public class Duck extends Bird implements AnimalSound{

	public void swim() {
		System.out.println("I am swimming");

	}


	@Override
	public void makeSound() {
		System.out.println("Quack, quack");
		
	}
}
