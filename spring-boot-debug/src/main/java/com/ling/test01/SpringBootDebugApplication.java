package com.ling.test01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDebugApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDebugApplication.class, args);
		System.out.println("run...");
	}

}
