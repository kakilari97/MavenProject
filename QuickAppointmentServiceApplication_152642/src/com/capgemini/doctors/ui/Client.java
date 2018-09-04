package com.capgemini.doctors.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.service.DoctorAppointmentService;
import com.capgemini.doctors.service.DoctorAppointmentValidate;

public class Client {
	static int b;
	public static void main(String[] args) {
		
		int choice=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("***Quick Appointment Service Application***\n");
		System.out.println("-------------------Welcome-----------------\n");
		try {
			do {
				//Menu
				System.out.println("Enter your choice:\n"
						+ "1.Book Doctor Appointment\n2.View Doctor Appointment\n"
						+ "3.Exit\n");
				choice=Integer.parseInt(br.readLine());
				switch(choice) {
				case 1:
					bookAppointment();;
					break;
					
				case 2:
					viewAppointment();
					break;
					
				case 3:
					System.exit(0);
					break;
				
				default:
					System.out.println("Invalid choice\n");
					break;
				}
			}while(choice!=3);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	

	private static void bookAppointment() {
		int appointmentId=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DoctorAppointmentService service=new DoctorAppointmentService();
		DoctorAppointment newappointment=new DoctorAppointment();
		DoctorAppointmentValidate validate=new DoctorAppointmentValidate();
		
		try
		{
			System.out.println("Enter Details:\n");
			System.out.println("Enter name of the patient:\n");
			String patientName=br.readLine();
			System.out.println("Enter Phone Number:\n");
			String phoneNumber=br.readLine();
			System.out.println("Enter Email-id:\n");
			String email=br.readLine();
			System.out.println("Enter age:\n");
			String age=br.readLine();
			System.out.println("Enter Gender:\n");
			String gender=br.readLine();
			System.out.println("Enter Problem Name:\n");
			String problemName=br.readLine();
			appointmentId = (int) (Math.random() * 1234 +9999);
			System.out.println("Appointment ID:"+appointmentId);
			newappointment.setPatientName(patientName);
			newappointment.setPhoneNumber(phoneNumber);
			newappointment.setEmail(email);
			newappointment.setAge(Integer.parseInt(age));
			newappointment.setGender(gender);
			newappointment.setProblemName(problemName);
			newappointment.setAppointmentId(appointmentId);
			boolean isValidproblemName=validate.validateProblemName(problemName);
			boolean isValidemail=validate.validateEmail(email);
			boolean isValidGender=validate.validateGender(gender);
			boolean isValidPhoneNumber=validate.validatePhoneNumber(phoneNumber);
			
			if(isValidproblemName && isValidemail && isValidGender && isValidPhoneNumber)
			{
				b=newappointment.getAppointmentId();
				System.out.println(newappointment.toString());
				System.out.println(service.addDoctorAppointmentDetails(newappointment));
				if(b==appointmentId) {
					System.out.println("Your Doctor Appointment has been successfully registered, your appointment ID is: "+b);
					if(newappointment.getProblemName().equals("Heart"))
					{
						newappointment.setDoctorName("Dr.Brijesh Kumar");
						System.out.println(newappointment.getDoctorName());
					}else if(newappointment.getProblemName().equals("Gynecology"))
					{
						newappointment.setDoctorName("Dr.Sharda Singh");
						System.out.println(newappointment.getDoctorName());
					}else if(newappointment.getProblemName().equals("Diabetes"))
					{
						newappointment.setDoctorName("Dr.Heena Khan");
						System.out.println(newappointment.getDoctorName());
					}else if(newappointment.getProblemName().equals("ENT"))
					{
						newappointment.setDoctorName("Dr.Paras Mal");
						System.out.println(newappointment.getDoctorName());
					}else if(newappointment.getProblemName().equals("Bone"))
					{
						newappointment.setDoctorName("Dr.Renuka Kher");
						System.out.println(newappointment.getDoctorName());
					}else if(newappointment.getProblemName().equals("Dermatology"))
					{
						newappointment.setDoctorName("Dr.Kanika Kapoor");
						System.out.println(newappointment.getDoctorName());
					}else {
						System.out.println("null");
					}
					
				}
			}else
			{
				System.out.println("Enter valid details!\n");
			}
//			if(b!=0) {
//				System.out.println("AppointmentId"+appointmentId);
//			}
		}
			catch (IOException e) {
				// TODO Auto-generated catch block
						e.printStackTrace();
				}
	}

	
	private static void viewAppointment() {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DoctorAppointmentService service=new DoctorAppointmentService();
		DoctorAppointment newappointment=new DoctorAppointment();
		System.out.println("Enter Appointment ID:\n");
		int t;
		try {
			t=Integer.parseInt(br.readLine());
			System.out.println(service.getDoctorAppointmentDetails(t));
			System.out.println(newappointment.toString());
			System.out.println("Appointment Date and time, along with doctor's phone number will be shared shortly with you\n");
		}catch(NumberFormatException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
}


