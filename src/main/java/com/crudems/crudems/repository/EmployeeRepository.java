package com.crudems.crudems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudems.crudems.entity.Employee;

@Repository

public interface EmployeeRepository extends JpaRepository <Employee,Long>{

}
