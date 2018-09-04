package com.cg.springmvcone.service;

import java.util.List;

import com.cg.springmvcone.dto.ScheduledSessions;

public interface EmployeeService {

	public List<ScheduledSessions> showAllEmployee();
	public ScheduledSessions searchEmployee(int id);
	public void updateEmployee(ScheduledSessions emp);
}
