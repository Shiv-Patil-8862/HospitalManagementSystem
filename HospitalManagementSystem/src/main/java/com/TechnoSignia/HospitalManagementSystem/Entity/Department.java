package com.TechnoSignia.HospitalManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Department {

	@Id
	@GeneratedValue
	private Long id;
	private String deptName;
	private Long deptStaff;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Long getDeptStaff() {
		return deptStaff;
	}
	public void setDeptStaff(Long deptStaff) {
		this.deptStaff = deptStaff;
	}
	
}
