package com.animals.app;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import com.animal.model.*;
import com.butterfly.model.*;
import com.swimming.animal.model.*;

public class CountingAnimals {

	public  int animalWalkCount(Animal[] animals) {
		int animalWalkCount = 0;
		for (Animal animal : animals) {
			try {
				animal.walk();
				animalWalkCount++;
			} catch (UnsupportedOperationException exc) {
				continue;
			}

		}
		return animalWalkCount;

	}

	public  int animalFlyCount(Animal[] animals) {
		int animalFlyCount = 0;
		for (Animal animal : animals) {
			if (animal instanceof Bird) {
				try {
					((Bird) animal).fly();

					animalFlyCount++;
				} catch (UnsupportedOperationException exc) {
					continue;
				}
			}

		}
		return animalFlyCount;
	}

	public  int animalSingCount(Animal[] animals) {
		int animalSingCount = 0;
		for (Animal animal : animals) {
			if (animal instanceof Bird) {
				try {
					((Bird) animal).sing();

					animalSingCount++;
				} catch (UnsupportedOperationException exc) {
					continue;
				}
			}

		}
		return animalSingCount;
	}

	public  int animalSwimCount(Animal[] animals) {
		int animalSwimCount = 0;
		for (Animal animal : animals) {
			if (animal instanceof CanSwim)
				animalSwimCount++;
		}

		return animalSwimCount;
	}
}
