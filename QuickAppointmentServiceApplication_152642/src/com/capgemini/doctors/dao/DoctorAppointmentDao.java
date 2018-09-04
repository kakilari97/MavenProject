package com.capgemini.doctors.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.capgemini.doctors.bean.DoctorAppointment;

public class DoctorAppointmentDao implements IDoctorAppointmentDao {

	boolean flag=false;
	DoctorAppointment newappointment=new DoctorAppointment();
	static Map<Integer,DoctorAppointment> appointments= new HashMap<Integer,DoctorAppointment>();
	
	public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment)
	{
		Integer appointmentId=0;
		appointments.put(newappointment.getAppointmentId(), newappointment);
		
		return newappointment.getAppointmentId();//appointmentId;
	}
	
	public DoctorAppointment getDoctorAppointmentDetails(int appointmentId)
	{
		
		Set s1=appointments.keySet();
		
		Iterator<Integer> itr=s1.iterator();
		while(itr.hasNext())
		{
			int k=itr.next();
			
			
			return appointments.get(k);
		}
		//System.out.println(appointments);
		return null;
	}
}
