package com.swimming.animal.model;

import com.animal.model.Animal;

public class Dolphin extends Animal implements CanSwim {

	public void swim() {
		System.out.println("I can swim");

	}
	public void walk() {
		throw new UnsupportedOperationException("Dolphin can not walk");
	}
}
