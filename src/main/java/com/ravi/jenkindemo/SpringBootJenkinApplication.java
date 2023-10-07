package com.ravi.jenkindemo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinApplication {
	private String str;
	public static Logger logger= LoggerFactory.getLogger(SpringBootJenkinApplication.class);
@PostConstruct
	public void init(){
		logger.info("Spring Boot Application started {}");
		str="Happy Coding!";
	logger.info(str.substring(1));
	}
	public static void main(String[] args) {
		logger.info("Spring Boot application executed {}");
		SpringApplication.run(SpringBootJenkinApplication.class, args);
	}

}
