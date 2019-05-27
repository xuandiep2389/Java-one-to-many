package com.will.springonetomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringOneToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOneToManyApplication.class, args);
	}

}
