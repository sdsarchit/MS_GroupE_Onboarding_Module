package com.example.MS_training.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.SpringApplication;
import org.springframework.http.ResponseEntity;

import com.example.MS_training.Entity.Conditions;
import com.example.MS_training.Entity.Onboardee;
import com.example.MS_training.Entity.OnboardeeRequirement;
import com.example.MS_training.Service.service;

import org.junit.jupiter.api.Test;
@ExtendWith(MockitoExtension.class)
class ControllerTest {
	@InjectMocks
	Controller control;
	@Mock
	service serve;
	public Onboardee initial() {
		Onboardee on=new Onboardee();
		on.setOnboardeeID(0);
		on.setOnboardeeName("dsfdsf");
		on.setDate_of_Birth("01-01-2000");
		on.setEmail("xyz@gmail.com");
		on.setPhone_number("987654321");
		on.setHighestQualification("BTECH");
		return on;
	}
	public OnboardeeRequirement initialize() {
		OnboardeeRequirement ore=new OnboardeeRequirement();
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
	void addon() {
		Mockito.when(serve.AddOnboardee(Mockito.anyObject())).thenReturn("Success");
		Onboardee on=initial();
		String response=control.AddOnboardee(on);
		Assertions.assertEquals("Success",response);
	}
	@Test
	void addre() {
		Mockito.when(serve.AddRequirement(Mockito.anyObject())).thenReturn("Success");
		OnboardeeRequirement ore=initialize();
		String response=control.AddRequirement(ore);
		Assertions.assertEquals("Success",response);
	}
	@Test
	void delete() {
		String response1=control.Delete("Onboardee_ID","1");
		Assertions.assertEquals(null,response1);
		Mockito.when(serve.DeleteOnboardee(Mockito.anyString(),Mockito.anyString())).thenReturn("Success");
		Onboardee on=initial();
		String response=control.Delete("Onboardee_ID","0");
		Assertions.assertEquals("Success",response);
	}
	@Test
	void view() {
		List<Onboardee> on=new ArrayList<Onboardee>();
		List<Onboardee> response=control.View();
		Assertions.assertEquals(on,response);
	}
	@Test
	void editon() {
		Mockito.when(serve.EditOnboardee(Mockito.anyString(),Mockito.anyString())).thenReturn("Success");
		Onboardee on=initial();
		Conditions c=new Conditions();
		c.setChanges("Onboardee_ID=1");
		c.setConditions("Onboardee_ID=0");
		String response=control.EditOnboardee(c);
		Assertions.assertEquals("Success",response);
	}
	@Test
	void editre() {
		Mockito.when(serve.EditRequirement(Mockito.anyString(),Mockito.anyString())).thenReturn("Success");
		OnboardeeRequirement ore=initialize();
		Conditions c=new Conditions();
		c.setChanges("Demand_ID=1");
		c.setConditions("Demand_ID=0");
		String response=control.EditRequirement(c);
		Assertions.assertEquals("Success",response);
	}
}
