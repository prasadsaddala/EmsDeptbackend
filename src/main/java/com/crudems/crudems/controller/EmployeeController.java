package com.crudems.crudems.controller;

import java.util.List;

import org.apache.catalina.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.crudems.crudems.entity.Employee;
import com.crudems.crudems.service.Employeeservice;

@RestController
public class EmployeeController {
	@Autowired
	private Employeeservice employeeservice;
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return employeeservice.getEmployeeById(id);
	}
	@GetMapping("/employee")
	public List<Employee> getAllEmployeeDetailes() {
		return employeeservice.getEmployees();
	}
	@PostMapping("/addemployee")
	public void addEmployees(@RequestBody Employee employee){
        employeeservice.addEmployee(employee);
    }
	@PutMapping("/updateEmp/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        return employeeservice.updateEmployee(id,employee);
    }
    @DeleteMapping("/deleteEmp/{id}")
    public void deleteEmployee(@PathVariable Long id){
    	employeeservice.deleteEmployee(id);
    }
    
    }

