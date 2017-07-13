package com.carshow.carshow.app;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.carshow.carshow")
@EnableJpaRepositories(basePackages = "com.carshow.carshowrepo")
@EntityScan(basePackages = "com.carshow.carshow.model")
public class CarshowApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarshowApplication.class, args);
	}
}
//862970