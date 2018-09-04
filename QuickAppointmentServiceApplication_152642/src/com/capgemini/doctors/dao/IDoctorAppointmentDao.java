package com.capgemini.doctors.dao;

import com.capgemini.doctors.bean.DoctorAppointment;

public interface IDoctorAppointmentDao {

	public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment);
	public DoctorAppointment getDoctorAppointmentDetails(int AppointmentId);
}
