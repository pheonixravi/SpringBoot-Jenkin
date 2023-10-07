package com.ravi.jenkindemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootJenkinApplicationTests {
	public static Logger logger= LoggerFactory.getLogger(SpringBootJenkinApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test cases execting...");
		assertEquals(true,true);
	}

}
