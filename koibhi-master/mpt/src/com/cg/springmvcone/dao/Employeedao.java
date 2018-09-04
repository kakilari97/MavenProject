package com.cg.springmvcone.dao;

import java.util.List;

import com.cg.springmvcone.dto.ScheduledSessions;

public interface Employeedao {
	public List<ScheduledSessions> showAllEmployee();
	public ScheduledSessions searchEmployee(int id);
	public void updateEmployee(ScheduledSessions emp);
}
