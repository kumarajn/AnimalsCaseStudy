package com.butterfly.model;

import com.animal.model.Animal;
import com.animal.model.Bird;

public class ButterFly extends Bird {

	private boolean isCaterpiller=false;

	public void fly() {
		if (!isCaterpiller)
			System.out.println("I am flying");
		else
			throw new UnsupportedOperationException("A caterpiller cannot fly");
	}

	public void sing() {
		throw new UnsupportedOperationException("A butterfly cannot make sound");

	}

	public void walk() {
		if (isCaterpiller)
			System.out.println("I am walking");
		else
			throw new UnsupportedOperationException("A butterfly cannot walk");
	}

	public boolean isCaterpiller() {
		return isCaterpiller;
	}

	public void setCaterpiller(boolean isCaterpiller) {
		this.isCaterpiller = isCaterpiller;
	}

}
