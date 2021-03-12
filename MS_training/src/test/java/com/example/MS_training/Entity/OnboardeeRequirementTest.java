package com.example.MS_training.Entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class OnboardeeRequirementTest {
	@InjectMocks
	OnboardeeRequirement ore=new OnboardeeRequirement();
	public OnboardeeRequirement initialize() {
		ore.setDemandID(0);
		ore.setLocation("Hyd");
		ore.setSkills("dsf");
		ore.setOnboardeeID(0);
		ore.setOnboarding_Start_Date("1-1-2020");
		ore.setOnboarding_Status("pending");
		ore.setETA("14:00");
		ore.setBGC_Check("pending");
		return ore;
	}
	@Test
	void test() {
		ore=initialize();
		Assertions.assertEquals(0, ore.getDemandID());
		Assertions.assertEquals("Hyd", ore.getLocation());
		Assertions.assertEquals("dsf", ore.getSkills());
		Assertions.assertEquals(0, ore.getOnboardeeID());
		Assertions.assertEquals("1-1-2020", ore.getOnboarding_Start_Date());
		Assertions.assertEquals("pending", ore.getOnboarding_Status());
		Assertions.assertEquals("14:00", ore.getETA());
		Assertions.assertEquals("pending", ore.getBGC_Check());
	}

}
