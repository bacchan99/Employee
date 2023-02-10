package com.aman.codework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aman.codework.entity.Employee;
import com.aman.codework.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employees")
	public Employee saveEmployee(@Valid @RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);

	}

	@GetMapping("/employee")
	public List<Employee> fetchEmployee() {
		System.out.println("************AMAN************");
		return employeeService.fetchEmployee();
	}

	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		employeeService.deleteEmployee(id);
		return "Deleted successfully";

	}

	@DeleteMapping("/employee")
	public String deleteAllEmployee() {
		employeeService.deleteAllEmployee();
		return "Deleted All";

	}

	@PutMapping("/employee/{id}")
	public String updateEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		return "updated successfully";

	}

}
