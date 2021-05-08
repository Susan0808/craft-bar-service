package com.susan.craftbarservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.susan.craftbarservice.repository.BeerRepository;
import com.susan.craftbarservice.service.CraftBarService;

@SpringBootTest
class CraftBarServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@MockBean
	private BeerRepository mockRepository;
	
	@MockBean
	private CraftBarService mockService;

}
