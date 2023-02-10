package com.aman.codework.service;


import java.util.List;

import com.aman.codework.entity.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	
	public List<Employee> fetchEmployee();
	
	public String deleteEmployee(int id);
	
	public String deleteAllEmployee();
	
	public Employee updateEmployee(Employee employee);
	


}
