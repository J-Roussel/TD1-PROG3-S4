package com.PROG3S4.TD1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.PROG3S4.TD1")
public class Td1Application {

	public static void main(String[] args) {
		SpringApplication.run(Td1Application.class, args);
	}

}
