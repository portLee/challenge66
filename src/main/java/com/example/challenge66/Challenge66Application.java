package com.example.challenge66;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Challenge66Application {

	public static void main(String[] args) {
		SpringApplication.run(Challenge66Application.class, args);
	}

}
