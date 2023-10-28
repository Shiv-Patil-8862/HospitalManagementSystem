package com.TechnoSignia.HospitalManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.TechnoSignia.HospitalManagementSystem.Entity.Patient;
import com.TechnoSignia.HospitalManagementSystem.Repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	PatientRepository patientRepository;
	
	public Patient createPatient(Patient patient) {
		return patientRepository.save(patient);
	}
	
	public List<Patient> createAllPatient(List<Patient> patient){
		return patientRepository.saveAll(patient);
	}
	
	public Patient findbyIdPatient(Long id) {
		return patientRepository.findById(id).get();
	}
	
	public List<Patient> findAllPatients(){
		return patientRepository.findAll();
	}
	
	public void deletePatient(Long id) {
		patientRepository.deleteById(id);
	}
	
	public void deleteAllPatients() {
		patientRepository.deleteAll();
	}
	
	public Patient updatePatient(Patient patient,Long id) {
		Patient pat=patientRepository.findById(id).get();
		if(patient.getName()!=null) {
			pat.setName(patient.getName());
		}
		if(patient.getContact()!=null) {
			pat.setContact(patient.getContact());
		}
		if(patient.getDisease()!=null) {
			pat.setDisease(patient.getDisease());
		}
		if(patient.getAddress()!=null) {
			pat.setAddress(patient.getAddress());
		}
		return patientRepository.save(pat);
	}
	
	public List<Patient> updateAllPatients(Patient patient){
		List<Patient> pat=patientRepository.findAll();
	    for(Patient patient1:pat) {
	    	if(patient.getName()!=null) {
				patient1.setName(patient.getName());
			}
			if(patient.getContact()!=null) {
				patient1.setContact(patient.getContact());
			}
			if(patient.getDisease()!=null) {
				patient1.setDisease(patient.getDisease());
			}
			if(patient.getAddress()!=null) {
				patient1.setAddress(patient.getAddress());
			}
	    }
	    return patientRepository.saveAll(pat);
	}
}
