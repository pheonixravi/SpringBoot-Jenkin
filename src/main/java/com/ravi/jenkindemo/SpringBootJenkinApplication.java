package com.ravi.jenkindemo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinApplication {
	public static Logger logger= LoggerFactory.getLogger(SpringBootJenkinApplication.class);
@PostConstruct
	public void init(){
		logger.info("Spring Boot Application started {}");
	}
	public static void main(String[] args) {
		logger.info("Spring Boot application executed {}");
		SpringApplication.run(SpringBootJenkinApplication.class, args);
	}

}
