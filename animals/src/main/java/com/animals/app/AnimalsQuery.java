package com.animals.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.animal.model.Animal;
import com.animals.service.AnimalQueryFunctions;

@RestController
public class AnimalsQuery {

	@Autowired
	AnimalQueryFunctions animalQueryFunctions;

	@RequestMapping(value = "/animals", method = RequestMethod.GET)
	public String animalsList() {

		return animalQueryFunctions.animalsInfo();

	}

}
