package com.example.MS_training.Entity;

public class OnboardeeRequirement {
private int DemandID;
private String Location;
private String Skills;
private int OnboardeeID;
private String Onboarding_Start_Date;
private String ETA;
private String BGC_Check;
private String Onboarding_Status;
public OnboardeeRequirement() {}
public int getDemandID() {
	return DemandID;
}
public void setDemandID(int demandID) {
	DemandID = demandID;
}
public String getLocation() {
	return Location;
}
public void setLocation(String location) {
	Location = location;
}
public String getSkills() {
	return Skills;
}
public void setSkills(String skills) {
	Skills = skills;
}
public int getOnboardeeID() {
	return OnboardeeID;
}
public void setOnboardeeID(int onboardeeID) {
	OnboardeeID = onboardeeID;
}
public String getOnboarding_Start_Date() {
	return Onboarding_Start_Date;
}
public void setOnboarding_Start_Date(String onboarding_Start_Date) {
	Onboarding_Start_Date = onboarding_Start_Date;
}
public String getETA() {
	return ETA;
}
public void setETA(String eTA) {
	ETA = eTA;
}
public String getBGC_Check() {
	return BGC_Check;
}
public void setBGC_Check(String bGC_Check) {
	BGC_Check = bGC_Check;
}
public String getOnboarding_Status() {
	return Onboarding_Status;
}
public void setOnboarding_Status(String onboarding_Status) {
	Onboarding_Status = onboarding_Status;
}
}
