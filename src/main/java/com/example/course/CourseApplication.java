package com.example.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApplication {

	// https://stackoverflow.com/questions/22380119/why-does-my-spring-boot-app-always-shutdown-immediately-after-starting
	
	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}

}
