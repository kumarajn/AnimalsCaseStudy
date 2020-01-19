package com.swimming.animal.model;

import com.animal.model.Animal;

public class Fish extends Animal implements CanSwim {

	String size;
	String colour;

	public Fish() {
		
	}

	public void swim() {
		System.out.println("I can swim");

	}
	public void walk() {
	throw new UnsupportedOperationException("fish cant walk");
	}
}
