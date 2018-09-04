package com.capgemini.doctors.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.doctors.service.DoctorAppointmentValidate;

class DoctorAppointmentValidateTest {
DoctorAppointmentValidate v=new DoctorAppointmentValidate();
	@Test
	void testValidateProblemName() {
	//	fail("Not yet implemented");
		assertEquals(true,v.validateProblemName("Heart"));
		assertEquals(true,v.validateProblemName("Gynecology"));
	}

	@Test
	void testValidateEmail() {
		//fail("Not yet implemented");
		assertEquals(true,v.validateEmail("kiara@gmail.com"));
	}

	@Test
	void testValidateGender() {
		//fail("Not yet implemented");
		assertEquals(true,v.validateGender("Male"));
		assertEquals(true,v.validateGender("Female"));
		
	}

	@Test
	void testValidatePhoneNumber() {
		assertEquals(true,v.validatePhoneNumber("9797979797"));
	//	fail("Not yet implemented");
	}

}
