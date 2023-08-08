package com.crudems.crudems.service;

import java.util.List;

import org.apache.catalina.Manager;
import org.springframework.stereotype.Service;

import com.crudems.crudems.entity.Employee;

@Service
public interface Employeeservice {
	public Employee getEmployeeById(Long id);
	public List<Employee> getEmployees();
	public void addEmployee(Employee employee);
	Employee updateEmployee(Long id, Employee employee);
	void deleteEmployee(Long Id);
	
}
