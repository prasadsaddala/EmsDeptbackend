package com.crudems.crudems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crudems.crudems.entity.Department;


@Service
public interface Departmentservice {
	
	public Department getDepartment(Long Id);
	public List<Department> getDepartments();
	public Department addDepartment(Department department);
	Department updateDepartment(Long id, Department department);
	void deleteDepartment(Long Id);
}
