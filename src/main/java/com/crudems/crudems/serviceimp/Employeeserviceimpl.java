package com.crudems.crudems.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudems.crudems.entity.Employee;
import com.crudems.crudems.repository.EmployeeRepository;
import com.crudems.crudems.service.Employeeservice;

@Service

public class Employeeserviceimpl implements Employeeservice {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@SuppressWarnings("deprecation")
	@Override

	public Employee getEmployeeById(Long Id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(Id).get();
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

	@Override

    public Employee updateEmployee(Long id, Employee employee) {
        Employee employeeToUpdate = employeeRepository.findById(id).orElseThrow();
        employeeToUpdate.setEmpName(employee.getEmpName());
        employeeToUpdate.setEmpDob(employee.getEmpDob());
        employeeToUpdate.setSalary(employee.getSalary());
        employeeToUpdate.setMobile(employee.getMobile());
        //employeeToUpdate.setDepartment(employee.getDepartment());
        employeeToUpdate.setManagerId(employee.getManagerId());
        return employeeRepository.save(employeeToUpdate);
    }

	@Override
	public void deleteEmployee(Long Id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(Id);
	}

	

}
