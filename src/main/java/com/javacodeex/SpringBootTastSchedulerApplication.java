package com.javacodeex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootTastSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTastSchedulerApplication.class, args);
	}

}
