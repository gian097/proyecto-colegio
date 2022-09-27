package com.proyectoColegio.colegio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ColegioApplication {

	@GetMapping("/hello")
	public String hello(){
		return "hola negros";
	}

	public static void main(String[] args) {
		SpringApplication.run(ColegioApplication.class, args);
	}

}
