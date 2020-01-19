package com.animal.model;

public class Parrot extends Bird implements AnimalSound {

	private AnimalSound nearAnimalSound;

	public AnimalSound getAnimalSound() {
		return nearAnimalSound;
	}

	public void setAnimalSound(AnimalSound animalSound) {
		nearAnimalSound = animalSound;
	}

	@Override
	public void makeSound() {
		if (nearAnimalSound == null)
			System.out.println("parrot origional sound");
		else
			nearAnimalSound.makeSound();
	}
}
