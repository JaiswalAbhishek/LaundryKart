package com.booking.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.booking.model.Employee;
import com.booking.service.EmployeeService;

public class EmployeeServiceImplemention implements EmployeeService {

	
	private List<Employee> listOfEmployees = new ArrayList<Employee>();
	public List<Employee> getListOfEmployeesInMemory() {
		return listOfEmployees;
	}
	public void setListOfEmployees(List<Employee> listOfEmployees) {
		this.listOfEmployees = listOfEmployees;
	}

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
		EmployeeServiceImplemention empservice = new EmployeeServiceImplemention();
		Employee e1 = new Employee("SSN1010",11696404,"Abhishek","Jaiswal","Male","Whitefield,Bangalore","jaiswal.abhishek523",25000,"Manager",true);
		Employee e2 = new Employee("SSN1011",11696405,"Kumar","Ankit","Male","Whitefield,Bangalore","jaiswal.abhishek523",25000,"Manager",true);
		
		
		empservice.getListOfEmployeesInMemory().add(e1);
		empservice.getListOfEmployeesInMemory().add(e2);
		
		
		
		return empservice.getListOfEmployeesInMemory();
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
