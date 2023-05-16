package com.ssu.moassubackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MoassuBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoassuBackendApplication.class, args);
	}

}
