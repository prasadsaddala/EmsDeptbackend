package com.crudems.crudems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudems.crudems.entity.Department;

public interface DepartmentRepository  extends JpaRepository <Department,Long> {

}
