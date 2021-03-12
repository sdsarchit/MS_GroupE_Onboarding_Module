package com.example.MS_training.Entity;

public class Onboardee {
private int OnboardeeID;
private String OnboardeeName;
private String Date_of_Birth;
private String Email;
private String HighestQualification;
private String Phone_number;
public Onboardee() {}
public String getPhone_number() {
	return Phone_number;
}
public void setPhone_number(String phone_number) {
	Phone_number = phone_number;
}
public int getOnboardeeID() {
	return OnboardeeID;
}
public void setOnboardeeID(int onboardeeID) {
	OnboardeeID = onboardeeID;
}
public String getOnboardeeName() {
	return OnboardeeName;
}
public void setOnboardeeName(String onboardeeName) {
	OnboardeeName = onboardeeName;
}
public String getDate_of_Birth() {
	return Date_of_Birth;
}
public void setDate_of_Birth(String date_of_Birth) {
	Date_of_Birth = date_of_Birth;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getHighestQualification() {
	return HighestQualification;
}
public void setHighestQualification(String highestQualification) {
	HighestQualification = highestQualification;
}
}
