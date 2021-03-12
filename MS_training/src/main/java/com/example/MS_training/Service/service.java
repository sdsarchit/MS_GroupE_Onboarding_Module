package com.example.MS_training.Service;

import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONObject;

import com.example.MS_training.Entity.Conditions;
import com.example.MS_training.Entity.Onboardee;
import com.example.MS_training.Entity.OnboardeeRequirement;

public interface service {
public String AddRequirement(OnboardeeRequirement re);
public String AddOnboardee(Onboardee on);
public List<Onboardee> ViewOnboardee();
public String EditRequirement(String updateset,String conditionset);
public String EditOnboardee(String updateset,String conditionset);
public String DeleteOnboardee(String column_name, String condition);
}
