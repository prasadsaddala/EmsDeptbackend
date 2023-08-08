package com.crudems.crudems.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="department")
public class Department {
	@Id
	@Column(name="dept_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long deptId;
	private String deptName;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(Long deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
		
}
