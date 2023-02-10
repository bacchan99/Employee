package com.aman.codework.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity

@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	@NotBlank(message ="Name is Mandatory")
	@Nonnull
	private String ename;
	private String dept;
	private String role;
	private int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", dept=" + dept + ", role=" + role + ", salary=" + salary
				+ "]";
	}
	public Employee(int id, String ename, String dept, String role, int salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.dept = dept;
		this.role = role;
		this.salary = salary;
	}

}
