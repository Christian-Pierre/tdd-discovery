package com.example.tdd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class TddApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void initTest(){
		String testeString = "Hello";
		Assert.hasText(testeString, "Teste");
	}

}
