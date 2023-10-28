package com.TechnoSignia.HospitalManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TechnoSignia.HospitalManagementSystem.Entity.Department;
import com.TechnoSignia.HospitalManagementSystem.Service.DepartmentService;

@RestController
@RequestMapping("/Department")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/saveDepartment")
	public Department createDepartment(@RequestBody Department department) {
		return departmentService.createDepartment(department);
	}
	
	@PostMapping("/saveAllDepartment")
	public List<Department> createAllDepartment(@RequestBody List<Department> departments){
		return departmentService.createAllDepartments(departments);
	}
	
	@GetMapping("/findDepartment/{id}")
	public Department findByIdDepartment(@PathVariable Long id) {
		return departmentService.findbyIDepartment(id);
	}
	
	@GetMapping("/findAllDepartment")
	public List<Department> findAllDepartment() {
		return departmentService.findAllDepartments();
	}
	
	@DeleteMapping("/deleteDepartment/{id}")
	public String deleteDepartment(@PathVariable Long id) {
		departmentService.deleteDepartment(id);
		return "Department Delete Successfully";
	}
	
	@DeleteMapping("/deleteAllDepartment")
	public String deleteAllDepartment() {
		departmentService.deleteAllDepartments();
		return "All Department Delete Successfully";
	}
	
	@PutMapping("/updateDepartment/{id}")
	public Department updateDepartment(@RequestBody Department departments,@PathVariable Long id) {
		return departmentService.updateDepartment(departments, id);
	}
	
	@PutMapping("/updateAllDepartment")
	public List<Department> updateAllDepartment(@RequestBody Department departments){
		return departmentService.updateAllDepartments(departments);
	}
}
