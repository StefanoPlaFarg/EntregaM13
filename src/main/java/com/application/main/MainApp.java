package com.application.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication es equivalente a:

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan


@SpringBootApplication 

//Para que ApllicationContext pueda crear los Beans (Components) de las clases situadas en otros packages
@ComponentScan(basePackages = "com.application.controller") 
@ComponentScan(basePackages = "com.application.service") 
@ComponentScan(basePackages = "com.application.domain") 

public class MainApp {

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
	}

}
