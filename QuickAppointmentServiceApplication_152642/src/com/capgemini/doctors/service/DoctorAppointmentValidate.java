package com.capgemini.doctors.service;

public class DoctorAppointmentValidate {

	public boolean validateProblemName(String problemName) {
		if(problemName.equalsIgnoreCase("Dermatology")||problemName.equalsIgnoreCase("Heart")||problemName.equalsIgnoreCase("Gynecology")||problemName.equalsIgnoreCase("Diabetes")||problemName.equalsIgnoreCase("ENT")||problemName.equalsIgnoreCase("Bone"))
		{
			return true;
		}
			return false;
	}

	public boolean validateEmail(String email) {
		if(email.contains("@")&& email.contains(".")) {
			return true;
		}
		return false;
	}

	public boolean validateGender(String gender) {
		if(gender.equalsIgnoreCase("MALE")||gender.equalsIgnoreCase("FEMALE"))
		{
			return true;
		}
		return false;
	}

	public boolean validatePhoneNumber(String phoneNumber) {
		if(phoneNumber.length()!=10||phoneNumber.isEmpty())
		{
		return false;
	}
		return true;
	}

	
	
}
