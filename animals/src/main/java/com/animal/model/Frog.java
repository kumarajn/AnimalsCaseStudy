package com.animal.model;

import com.swimming.animal.model.CanSwim;

public class Frog extends Animal implements AnimalSound , CanSwim{

	@Override
	public void makeSound() {
		
	System.out.println("Tarr, tarr");	
	}

	@Override
	public void swim() {
		System.out.println("I can swim");
		
	}

}
