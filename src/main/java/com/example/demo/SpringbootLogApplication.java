package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.demo.mapper")
@SpringBootApplication(scanBasePackages = "com.example.demo")
public class SpringbootLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLogApplication.class, args);
	}

}
