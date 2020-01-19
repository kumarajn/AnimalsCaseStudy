package com.animal.model;

public class Rooster extends Bird{
	public void sing() {
		System.out.println("Cock-a-doodle-doo");

	}
	public void fly() {
		throw new UnsupportedOperationException("cannot fly");
	}
}
