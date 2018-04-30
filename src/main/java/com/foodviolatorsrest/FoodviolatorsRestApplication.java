package com.foodviolatorsrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class FoodviolatorsRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodviolatorsRestApplication.class, args);
	}
}
