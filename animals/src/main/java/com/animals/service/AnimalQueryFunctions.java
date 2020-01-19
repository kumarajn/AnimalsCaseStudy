package com.animals.service;

import org.springframework.stereotype.Service;

import com.animal.model.Animal;
import com.animal.model.Bird;
import com.animal.model.Cat;
import com.animal.model.Chicken;
import com.animal.model.Dog;
import com.animal.model.Duck;
import com.animal.model.Frog;
import com.animal.model.Parrot;
import com.animal.model.Rooster;
import com.butterfly.model.ButterFly;
import com.swimming.animal.model.ClownFish;
import com.swimming.animal.model.Dolphin;
import com.swimming.animal.model.Fish;
import com.swimming.animal.model.Shark;

@Service
public class AnimalQueryFunctions {

	
	public String animalsInfo()
	{
		Animal[] animals = new Animal[] { 
				new Cat() };
		String animalsInfo="";
		for(Animal animal:animals)
			animalsInfo=animalsInfo.concat(animal.toString());
		return animalsInfo.toString();
	}
}
