package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringBootDemoApplicationTests.class)
public class SpringBootDemoApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println(123);
	}

}
