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

import com.TechnoSignia.HospitalManagementSystem.Entity.Doctor;
import com.TechnoSignia.HospitalManagementSystem.Service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	DoctorService doctorService;
	
	@PostMapping("/saveDoctor")
	public Doctor createDoctor(@RequestBody Doctor doctor) {
		return doctorService.createDoctor(doctor);
	}
	
	@PostMapping("/saveAllDoctor")
	public List<Doctor> createAllDoctor(@RequestBody List<Doctor> doctor){
		return doctorService.createAllDoctor(doctor);
	}
	
	@GetMapping("/findDoctor/{id}")
	public Doctor findByIdDoctor(@PathVariable Long id) {
		return doctorService.findbyIdDoctor(id);
	}
	
	@GetMapping("/findAllDoctor")
	public List<Doctor> findAllDoctors() {
		return doctorService.findAllDoctors();
	}
	
	@DeleteMapping("/deleteDoctor/{id}")
	public String deleteDoctor(@PathVariable Long id) {
		doctorService.deleteDoctor(id);
		return "Doctor Delete Successfully";
	}
	
	@DeleteMapping("/deleteAllDoctor")
	public String deleteAllDoctors() {
		doctorService.deleteAllDoctors();
		return "All Doctors Delete Successfully";
	}
	
	@PutMapping("/updateDoctor/{id}")
	public Doctor updateDoctor(@RequestBody Doctor doctor,@PathVariable Long id) {
		return doctorService.updateDoctor(doctor, id);
	}
	
	@PutMapping("/updateAllDoctor")
	public List<Doctor> updateAllDoctor(@RequestBody Doctor doctor){
		return doctorService.updateAllDoctor(doctor);
	}
}
