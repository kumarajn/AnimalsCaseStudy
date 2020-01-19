package com.animals.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value="com")
public class AnimalDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalDemoApplication.class, args);
	}

}
