package com.crudems.crudems.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudems.crudems.entity.Department;

import com.crudems.crudems.repository.DepartmentRepository;
import com.crudems.crudems.service.Departmentservice;


@Service
public class Departmentserviceimpl implements Departmentservice {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	@SuppressWarnings("deprecation")
	@Override
	public Department getDepartment(Long Id) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(Id).get();
	}

	@Override
	public List<Department> getDepartments() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	@Override
	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
    public Department updateDepartment(Long id, Department department) {
		Department departmentToUpdate = departmentRepository.findById(id).orElseThrow();
		departmentToUpdate.setDeptName(department.getDeptName());
        return departmentRepository.save(departmentToUpdate);
    }
	@Override
	public void deleteDepartment(Long Id) {
		// TODO Auto-generated method stub
		departmentRepository.deleteById(Id);	
	}
}
