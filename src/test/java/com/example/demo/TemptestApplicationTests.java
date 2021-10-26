package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TemptestApplicationTests {

	@Test
	void contextLoads() throws Exception {
		int i = 0;
		if(i / 0 == 0) return;
	}

}
