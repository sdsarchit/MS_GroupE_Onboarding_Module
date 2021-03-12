package com.example.MS_training.Service.Implement;


import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.MS_training.Controller.Controller;
import com.example.MS_training.Entity.Conditions;
import com.example.MS_training.Entity.Onboardee;
import com.example.MS_training.Entity.OnboardeeRequirement;
import com.example.MS_training.Service.service;

@ExtendWith(MockitoExtension.class)
class serviceImplTest {
	
	@Mock
	Controller control;
    @InjectMocks
    service serveimp=new serviceImpl();
    @Autowired
    serviceImpl serveimp1=new serviceImpl();
    @Mock
	JdbcTemplate jdbcTemplate;

    @MockBean
    private Onboardee on;
    @MockBean
    private OnboardeeRequirement ore;
    @MockBean
    private Conditions c;
    public Onboardee initial() {
    	on=new Onboardee();
		on.setOnboardeeID(2);
		on.setOnboardeeName("dsfdsf");
		on.setDate_of_Birth("01-01-2000");
		on.setEmail("xyz@gmail.com");
		on.setPhone_number("987654321");
		on.setHighestQualification("BTECH");
		return on;
	}
	public OnboardeeRequirement initialize() {
		ore=new OnboardeeRequirement();
		ore.setDemandID(2);
		ore.setLocation("Hyd");
		ore.setSkills("dsf");
		ore.setOnboardeeID(2);
		ore.setOnboarding_Start_Date("1-1-2020");
		ore.setOnboarding_Status("pending");
		ore.setETA("14:00");
		ore.setBGC_Check("pending");
		return ore;
	}
	@Test
	void AddOnboardeeTest() {
		on=initial();
		Assertions.assertEquals("Success", serveimp.AddOnboardee(on));
		Assertions.assertNotEquals("Success", serveimp1.AddOnboardee(on));
	}
	@Test
	void AddRequirementTest() {
		ore=initialize();
		Assertions.assertEquals("Success", serveimp.AddRequirement(ore));

		Assertions.assertNotEquals("Success", serveimp1.AddRequirement(ore));
	}
	@Test
	void DeleteTest() {
		on=initial();
		String res=serveimp.AddOnboardee(on);
		Assertions.assertEquals("Success", serveimp.DeleteOnboardee("Onboardee_ID", "1"));
		//System.out.println(serveimp1.DeleteOnboardee("Onboardee_ID", "1"));
		Assertions.assertNotEquals("Success", serveimp1.DeleteOnboardee("Onboardee_ID", "1"));
	}
	@Test
	void ViewTest() {
		on=initial();
		String res=serveimp.AddOnboardee(on);
		Assertions.assertEquals(new ArrayList<Onboardee>(), serveimp.ViewOnboardee());
	}
	@Test
	void EditonTest() {
		on=initial();
		String res=serveimp.AddOnboardee(on);
		Assertions.assertEquals("Success", serveimp.EditOnboardee("Onboardee_ID=1", "Onboardee_ID=1"));
		Assertions.assertNotEquals("Success", serveimp1.EditOnboardee("Onboardee_ID=1", "Onboardee_ID=1"));
		
	}
	@Test
	void EditreTest() {
		ore=initialize();
		String res=serveimp.AddRequirement(ore);
		Assertions.assertEquals("Success", serveimp.EditRequirement("Onboardee_ID=1", "Onboardee_ID=1"));
		Assertions.assertNotEquals("Success", serveimp1.EditRequirement("Onboardee_ID=1", "Onboardee_ID=1"));
		
	}
}
