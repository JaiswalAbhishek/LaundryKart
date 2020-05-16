package com.booking.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.booking.dao.EmployeeDAO;
import com.booking.model.Employee;
import com.booking.service.EmployeeService;

public class EmployeeDAOLogic implements EmployeeDAO {

	@Autowired
	EmployeeService EmployeeServiceImplemention;
	
	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}	

	@Override
	public Employee getEmployeeByID(long employeeID) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateListOfEmployee(List<Employee> employeeListToBeUpdated) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee removeEmployeByID(Employee employeeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAllEmployee() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> removeEmployeeByCategory(String jobTitle) {
		// TODO Auto-generated method stub
		return null;
	}

}
