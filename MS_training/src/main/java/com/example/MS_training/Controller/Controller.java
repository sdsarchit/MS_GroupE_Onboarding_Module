package com.example.MS_training.Controller;
import java.util.HashMap;
import java.util.List;
import org.json.simple.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.MS_training.Entity.*;
import com.example.MS_training.Service.service;
import com.example.MS_training.Service.Implement.serviceImpl;


@RestController
@RequestMapping("/Onboard")
public class Controller {
	
	@Autowired
	service On_service;

	@PostMapping("/addon")
	public String AddOnboardee(@RequestBody Onboardee on) {
		
			return On_service.AddOnboardee(on);
		
	}
	@PostMapping("/addre")
	public String AddRequirement(@RequestBody OnboardeeRequirement on) {
		
			return On_service.AddRequirement(on);
		
	}
	@PostMapping("/delete")
	public String Delete(@RequestParam String column_name,@RequestParam String condition) {
		
			return On_service.DeleteOnboardee(column_name, condition);
		
	}
	@GetMapping("/View")
	public List<Onboardee> View() {
		
			return On_service.ViewOnboardee();
		
	}
	@PostMapping("/editon")
	public String EditOnboardee(@RequestBody Conditions condition){
		return On_service.EditOnboardee(condition.getChanges(), condition.getConditions());
	}
	@PostMapping("/editre")
	public String EditRequirement(@RequestBody Conditions condition){
		return On_service.EditRequirement(condition.getChanges(), condition.getConditions());
	}
}
