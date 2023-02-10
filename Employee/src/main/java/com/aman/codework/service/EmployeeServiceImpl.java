package com.aman.codework.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aman.codework.entity.Employee;
import com.aman.codework.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);

	}

	@Override
	public List<Employee> fetchEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public String deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return " Deleted successfully";
	}

	@Override
	public String deleteAllEmployee() {
		employeeRepository.deleteAll();
		return "Deleted All";
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);

	}

}
