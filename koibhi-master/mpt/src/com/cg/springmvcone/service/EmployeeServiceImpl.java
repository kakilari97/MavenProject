package com.cg.springmvcone.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.cg.springmvcone.dao.Employeedao;
import com.cg.springmvcone.dto.ScheduledSessions;
@Service("employeeservice")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
	Employeedao employeedao;
    
	@Override
	public List<ScheduledSessions> showAllEmployee() {
		// TODO Auto-generated method stub
		return employeedao.showAllEmployee();
	}
	@Override
	public ScheduledSessions searchEmployee(int id) {
		// TODO Auto-generated method stub
		return employeedao.searchEmployee(id);
	}
	
	public void updateEmployee(ScheduledSessions emp){
		
		 employeedao.updateEmployee(emp);
	}
	


}
