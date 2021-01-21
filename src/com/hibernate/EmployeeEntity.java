package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_1")
public class EmployeeEntity {
	
	@Id
	@Column(name="ID")
	private int employeeId;
	@Column(name="NAME")
	private String employeeName;
	@Column(name="SURNAME")
	private String employeeSurname;
	@Column(name="AGE")
	private int employeeAge;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeSurname() {
		return employeeSurname;
	}
	public void setEmployeeSurname(String employeeSurname) {
		this.employeeSurname = employeeSurname;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
}
