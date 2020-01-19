package com.animal.model;

public class Cat extends Animal implements AnimalSound {

	@Override
	public void makeSound() {
		System.out.println("Meow");

	}

	@Override
	public String toString() {
		return "Cat []";
	}

}
