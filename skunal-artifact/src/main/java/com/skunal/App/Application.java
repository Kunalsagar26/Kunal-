package com.skunal.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("This is the main class ");
		SpringApplication.run(Application.class, args);
	}

}
