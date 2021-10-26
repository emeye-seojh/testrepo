package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class TemptestApplicationTests {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	void contextLoads() throws Exception {
		int i = 0;
		if(i == 0) return;
	}

	@Test
	void fortemp() throws Exception {
		for(int i = 0 ; i < 100; i ++) {
			logger.debug("for : " + i);
		}
	}

}
