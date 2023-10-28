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
import com.TechnoSignia.HospitalManagementSystem.Entity.Patient;
import com.TechnoSignia.HospitalManagementSystem.Service.PatientService;

@RestController
@RequestMapping("/Patient")
public class PatientController {

	@Autowired
	PatientService patientService;
	
	@PostMapping("/savePatient")
	public Patient createDoctor(@RequestBody Patient patient) {
		return patientService.createPatient(patient);
	}
	
	@PostMapping("/saveAllPatient")
	public List<Patient> createAllDoctor(@RequestBody List<Patient> patient){
		return patientService.createAllPatient(patient);
	}
	
	@GetMapping("/findpatient/{id}")
	public Patient findByIdDoctor(@PathVariable Long id) {
		return patientService.findbyIdPatient(id);
	}
	
	@GetMapping("/findAllPatient")
	public List<Patient> findAllPatient() {
		return patientService.findAllPatients();
	}
	
	@DeleteMapping("/deletePatient/{id}")
	public String deletePatient(@PathVariable Long id) {
		patientService.deletePatient(id);
		return "Patient Delete Successfully";
	}
	
	@DeleteMapping("/deleteAllPatient")
	public String deleteAllPatient() {
		patientService.deleteAllPatients();
		return "All Patient Delete Successfully";
	}
	
	@PutMapping("/updatePatient/{id}")
	public Patient updateDoctor(@RequestBody Patient patient,@PathVariable Long id) {
		return patientService.updatePatient(patient, id);
	}
	
	@PutMapping("/updateAllPatient")
	public List<Patient> updateAllPatient(@RequestBody Patient patient){
		return patientService.updateAllPatients(patient);
	}
}
