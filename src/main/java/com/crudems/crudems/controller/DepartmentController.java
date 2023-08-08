package com.crudems.crudems.controller;

import java.util.List;

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

import com.crudems.crudems.entity.Department;
import com.crudems.crudems.service.Departmentservice;

@RestController
public class DepartmentController {
	@Autowired
	private Departmentservice departmentservice;
	
	@GetMapping("/department/{id}")
	public Department getDepartmentById(@PathVariable Long id) {
		return departmentservice.getDepartment(id);
	}

	@GetMapping("/department")
	public List<Department> getAllEmployeeDetailes1() {
		return departmentservice.getDepartments();
	}

	@PostMapping("/addDepartment")
	   public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
             return new ResponseEntity<Department>(departmentservice.addDepartment(department), HttpStatus.CREATED);

 }

	@PutMapping("/updateDept/{id}")
    public Department updateDepartment(@PathVariable Long id, @RequestBody Department department){
          return departmentservice.updateDepartment(id,department);
    }
      
    @DeleteMapping("/deleteDept/{id}")
    public void deleteDepartment(@PathVariable Long id){
    	departmentservice.deleteDepartment(id);

    }

}
