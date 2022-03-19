package com.example.RTCS;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableRabbit
@SpringBootApplication
public class RtcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RtcsApplication.class, args);
	}

}
