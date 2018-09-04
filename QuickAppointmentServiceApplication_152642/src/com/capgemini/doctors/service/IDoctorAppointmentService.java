package com.capgemini.doctors.service;

import com.capgemini.doctors.bean.DoctorAppointment;

public interface IDoctorAppointmentService {

	public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment);
	public DoctorAppointment getDoctorAppointmentDetails(int appointmentId);
}
