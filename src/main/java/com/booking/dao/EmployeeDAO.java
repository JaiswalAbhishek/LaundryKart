package com.booking.dao;

import java.util.List;

import com.booking.model.Employee;

public interface EmployeeDAO {
//CRUD
	public Employee createEmployee(Employee employee);
	public Employee getEmployeeByID(long employeeID);
	public List<Employee>getAllEmployees();
	public Employee updateEmployee(Employee employee);
	public boolean updateListOfEmployee(List<Employee> employeeListToBeUpdated);
	public Employee removeEmployeByID(Employee employeeID);
	public boolean removeAllEmployee();
	public List<Employee> removeEmployeeByCategory(String jobTitle);
}
