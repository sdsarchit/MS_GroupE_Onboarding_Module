package com.example.MS_training.Service.Implement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.sql.Timestamp;


import javax.sql.DataSource;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.MS_training.Entity.*;
import com.example.MS_training.Service.service;

@Service
public class serviceImpl implements service{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private String ts="current_timestamp()";
	@Override
	public String AddRequirement(OnboardeeRequirement re) {
		// TODO Auto-generated method stub
		Timestamp time=new Timestamp(System.currentTimeMillis());
		String query="insert into onboardeerequirement values('"+re.getDemandID()+"','"+re.getLocation()+"','"+re.getSkills()+"','"+re.getOnboardeeID()+"','"+re.getOnboarding_Start_Date()+"','"+re.getETA()+"','"+re.getBGC_Check()+"','"+re.getOnboarding_Status()+"','"+time+"','"+time+"')";  
		try {
			jdbcTemplate.update(query);
			return "Success";
		}
		catch(Exception e) {
			return e.getMessage();}
		
	}

	@Override
	public String AddOnboardee(Onboardee on) {
		// TODO Auto-generated method stub
		String query="insert into onboardeedetails values('"+on.getOnboardeeID()+"','"+on.getOnboardeeName()+"','"+on.getDate_of_Birth()+"','"+on.getPhone_number()+"','"+on.getEmail()+"','"+on.getHighestQualification()+"')";  
		try {
			jdbcTemplate.update(query);
			return "Success";
		}
		catch(Exception e) {
			return e.getMessage();}
	}
	@Override
	public String DeleteOnboardee(String column_name,String condition) {
		// TODO Auto-generated method stub
		
		String query="delete from onboardeedetails where "+column_name+"="+condition;  
		try {
			jdbcTemplate.update(query);
			return "Success";
		}
		catch(Exception e) {
			return e.getMessage();}

	}

	@Override
	public List<Onboardee> ViewOnboardee() {
		// TODO Auto-generated method stub
		String q="select * from onboardeedetails order by Onboardee_ID";  
			return jdbcTemplate.query(q, (result,row)->{
				Onboardee on=new Onboardee();
				on.setOnboardeeID(result.getInt("Onboardee_ID"));
				on.setOnboardeeName(result.getString("Onboardee_Name"));
				on.setDate_of_Birth(result.getString("Date_of_Birth"));
				on.setEmail(result.getString("Email"));
				on.setPhone_number(result.getString("Phone_Number"));
				on.setHighestQualification(result.getString("Highest_Qualifications"));
				return on;
			}
			);

	}

	@Override
	public String EditRequirement(String updateset,String conditionset) {
		// TODO Auto-generated method stub
		String st="update onboardeedetails set "+updateset+" where "+conditionset;

		try {
			jdbcTemplate.update(st);
			return "Success";
		}
		catch(Exception e) {
			return e.getMessage();}

	}

	@Override
	public String EditOnboardee(String updateset,String conditionset) {
		// TODO Auto-generated method stub
		String st="update onboardeedetails set "+updateset+" where "+conditionset;
		
		try {
			jdbcTemplate.update(st);
			return "Success";
		}
		catch(Exception e) {
			return e.getMessage();}

	}

}
