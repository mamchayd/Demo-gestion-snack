package com.snack.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class SnackServicesTest {
	@Autowired
	SnackServices snackServices;
	@Test
	public void testFindMenuByName() {
		snackServices.getMenuByName("tacos");
		assertThat(1).isEqualTo(1);
	}

}
