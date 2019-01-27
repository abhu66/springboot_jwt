package com.abukhoerul.pulsaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;



@SpringBootApplication
@EnableJpaAuditing
public class PulsaAppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PulsaAppApiApplication.class, args);
	}

}

