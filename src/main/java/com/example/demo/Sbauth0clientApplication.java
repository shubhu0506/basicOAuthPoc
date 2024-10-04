package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity
public class Sbauth0clientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sbauth0clientApplication.class, args);
	}

}
