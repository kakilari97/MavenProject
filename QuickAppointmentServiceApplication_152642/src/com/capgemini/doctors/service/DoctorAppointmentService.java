package com.capgemini.doctors.service;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.dao.DoctorAppointmentDao;

public class DoctorAppointmentService implements IDoctorAppointmentService {
	DoctorAppointment newappointment= new DoctorAppointment();
	DoctorAppointmentDao dao=new DoctorAppointmentDao();
	int n=0;

	public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment) 
	{
		return dao.addDoctorAppointmentDetails(newappointment);
	}
	public DoctorAppointment getDoctorAppointmentDetails(int appointmentId)
	{
		return dao.getDoctorAppointmentDetails(appointmentId);
	}
}
