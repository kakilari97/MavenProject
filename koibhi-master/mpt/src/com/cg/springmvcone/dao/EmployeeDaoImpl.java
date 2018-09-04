package com.cg.springmvcone.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cg.springmvcone.dto.ScheduledSessions;
@Repository("Employeedao")
public class EmployeeDaoImpl implements Employeedao {
    @PersistenceContext
	private EntityManager entitymanager;

	@Override
	public List<ScheduledSessions> showAllEmployee() {
		// TODO Auto-generated method stub
		List<ScheduledSessions> list = new ArrayList<>();
		Query query=entitymanager.createQuery("FROM ScheduledSessions");
		list= query.getResultList();
		return list;
	}
	@Override
	public ScheduledSessions searchEmployee(int id) {
		
		Query queryOne=entitymanager.createQuery
				("FROM ScheduledSessions where id=:emp_id");
		queryOne.setParameter("emp_id",id);
		ScheduledSessions empList=(ScheduledSessions) queryOne.getSingleResult();
		
		return empList;
	}
	
	public void updateEmployee(ScheduledSessions emp)
	{
		entitymanager.merge(emp);
		entitymanager.flush();
	}
	


}
