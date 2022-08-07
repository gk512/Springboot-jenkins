package com.app.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinsApplicationTests {

	public static Logger log=LoggerFactory.getLogger(SpringbootJenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		log.info("Entered into Test package");
	}

}
