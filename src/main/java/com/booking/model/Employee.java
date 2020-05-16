package com.booking.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Employee {

	@Id
	private String employeeSSN;
	private long employeeID;
	private String firstName;
	private String lastName;
	private String gender;
	private String Address;
	private String emailID;
	private long salary;
	private String jobTitle;
	private boolean status;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeSSN, long employeeID, String firstName, String lastName, String gender,
			String address, String emailID, long salary, String jobTitle, boolean status) {
		super();
		this.employeeSSN = employeeSSN;
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.Address = address;
		this.emailID = emailID;
		this.salary = salary;
		this.jobTitle = jobTitle;
		this.status = status;
	}
	
	
	public String getEmployeeSSN() {
		return employeeSSN;
	}
	public void setEmployeeSSN(String employeeSSN) {
		this.employeeSSN = employeeSSN;
	}
	public long getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Employee [employeeSSN=" + employeeSSN + ", employeeID=" + employeeID + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", gender=" + gender + ", Address=" + Address + ", emailID=" + emailID
				+ ", salary=" + salary + ", jobTitle=" + jobTitle + ", status=" + status + "]";
	}
	
	
}
