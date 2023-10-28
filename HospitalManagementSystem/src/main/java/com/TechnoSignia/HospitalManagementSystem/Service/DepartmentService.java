package com.TechnoSignia.HospitalManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TechnoSignia.HospitalManagementSystem.Entity.Department;
import com.TechnoSignia.HospitalManagementSystem.Repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;
	
	public Department createDepartment(Department department) {
		return departmentRepository.save(department);
	}
	
	public List<Department> createAllDepartments(List<Department> department){
		return departmentRepository.saveAll(department);
	}
	
	public Department findbyIDepartment(Long id) {
		return departmentRepository.findById(id).get();
	}
	
	public List<Department> findAllDepartments(){
		return departmentRepository.findAll();
	}
	
	public void deleteDepartment(Long id) {
		departmentRepository.deleteById(id);
	}
	
	public void deleteAllDepartments() {
		departmentRepository.deleteAll();
	}
	
	public Department updateDepartment(Department department,Long id) {
		Department pat=departmentRepository.findById(id).get();
		if(department.getDeptName()!=null) {
			pat.setDeptName(department.getDeptName());
		}
		if(department.getDeptStaff()!=null) {
			pat.setDeptStaff(department.getDeptStaff());
		}
		return departmentRepository.save(pat);
	}
	
	public List<Department> updateAllDepartments(Department department){
		List<Department> pat=departmentRepository.findAll();
	    for(Department department1:pat) {
	    	if(department.getDeptName()!=null) {
	    		department1.setDeptName(department.getDeptName());
			}
			if(department.getDeptStaff()!=null) {
				department1.setDeptStaff(department.getDeptStaff());
			}
	    }
	    return departmentRepository.saveAll(pat);
	}
}
