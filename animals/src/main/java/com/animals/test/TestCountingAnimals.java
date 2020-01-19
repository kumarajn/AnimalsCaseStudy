package com.animals.test;

import com.animal.model.*;
import com.animals.app.CountingAnimals;
import com.butterfly.model.ButterFly;
import com.swimming.animal.model.ClownFish;
import com.swimming.animal.model.Dolphin;
import com.swimming.animal.model.Fish;
import com.swimming.animal.model.Shark;

import junit.framework.*;;


public class TestCountingAnimals extends TestCase{

private Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
		new Fish(), new Shark(), new ClownFish(), new Dolphin(), new Frog(), new Dog(), new ButterFly(),
		new Cat() };	

public void testAnimalWalkCount()
{
	CountingAnimals countingAnimals=new CountingAnimals();
	int expectedWalkingCount=8;
	int actualWalkingCount=countingAnimals.animalWalkCount(animals);
	assertEquals(expectedWalkingCount, actualWalkingCount);

}
public void testAnimalFlyCount()
{
	CountingAnimals countingAnimals=new CountingAnimals();
	int expectedFlyingCount=4;
	int actualFlyingCount=countingAnimals.animalFlyCount(animals);
	assertEquals(expectedFlyingCount, expectedFlyingCount);

}	
public void testAnimalSingCount()
{
	CountingAnimals countingAnimals=new CountingAnimals();
	int expectedSingingCount=5;
	int actualSingingCount=countingAnimals.animalSingCount(animals);
	assertEquals(expectedSingingCount, actualSingingCount);

}
public void testAnimalSwimCount()
{
	CountingAnimals countingAnimals=new CountingAnimals();
	int expectedSwimmingCount=5;
	int actualSwimmingCount=countingAnimals.animalSwimCount(animals);
	assertEquals(expectedSwimmingCount, actualSwimmingCount);

}
	
}
