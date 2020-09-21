package com.bit.sts06;

import javax.activation.DataSource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

@Runwith(SpringJunit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class ContextTest {
	@AutoWired
	DataSource dataSource;
	
	@Test
	public void testDataSource() {
		assertNotNull(dataSource);
	}

}
