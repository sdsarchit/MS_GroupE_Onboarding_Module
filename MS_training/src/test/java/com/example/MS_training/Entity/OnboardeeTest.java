package com.example.MS_training.Entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class OnboardeeTest {
	@InjectMocks
	Onboardee on=new Onboardee();
	public Onboardee initial() {
		on.setOnboardeeID(0);
		on.setOnboardeeName("dsfdsf");
		on.setDate_of_Birth("01-01-2000");
		on.setEmail("xyz@gmail.com");
		on.setPhone_number("987654321");
		on.setHighestQualification("BTECH");
		return on;
	}
	@Test
	void test() {
		on=initial();
		Assertions.assertEquals(0, on.getOnboardeeID());
		Assertions.assertEquals("dsfdsf", on.getOnboardeeName());
		Assertions.assertEquals("01-01-2000", on.getDate_of_Birth());
		Assertions.assertEquals("xyz@gmail.com", on.getEmail());
		Assertions.assertEquals("987654321", on.getPhone_number());
		Assertions.assertEquals("BTECH", on.getHighestQualification());
	}

}
