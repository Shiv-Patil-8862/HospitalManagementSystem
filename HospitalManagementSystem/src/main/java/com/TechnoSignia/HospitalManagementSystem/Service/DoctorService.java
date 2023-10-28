package com.TechnoSignia.HospitalManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TechnoSignia.HospitalManagementSystem.Entity.Doctor;
import com.TechnoSignia.HospitalManagementSystem.Repository.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	DoctorRepository doctorRepository;
	
	public Doctor createDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}
	
	public List<Doctor> createAllDoctor(List<Doctor> doctor){
		return doctorRepository.saveAll(doctor);
	}
	
	public Doctor findbyIdDoctor(Long id) {
		return doctorRepository.findById(id).get();
	}
	
	public List<Doctor> findAllDoctors(){
		return doctorRepository.findAll();
	}
	
	public void deleteDoctor(Long id) {
		doctorRepository.deleteById(id);
	}
	
	public void deleteAllDoctors() {
		doctorRepository.deleteAll();
	}
	
	public Doctor updateDoctor(Doctor doctor,Long id) {
		Doctor doc=doctorRepository.findById(id).get();
		if(doctor.getName()!=null) {
			doc.setName(doctor.getName());
		}
		if(doctor.getContact()!=null) {
			doc.setContact(doctor.getContact());
		}
		if(doctor.getDepartment()!=null) {
			doc.setDepartment(doctor.getDepartment());
		}
		if(doctor.getEducation()!=null) {
			doc.setEducation(doctor.getEducation());
		}
		if(doctor.getEmail()!=null) {
			doc.setEmail(doctor.getEmail());
		}
		if(doctor.getSpecialization()!=null) {
			doc.setSpecialization(doctor.getSpecialization());
		}
		return doctorRepository.save(doc);
	}
	
	public List<Doctor> updateAllDoctor(Doctor doctor){
		List<Doctor> doc=doctorRepository.findAll();
	    for(Doctor doctor1:doc) {
	    	if(doctor.getName()!=null) {
				doctor1.setName(doctor.getName());
			}
			if(doctor.getContact()!=null) {
				doctor1.setContact(doctor.getContact());
			}
			if(doctor.getDepartment()!=null) {
				doctor1.setDepartment(doctor.getDepartment());
			}
			if(doctor.getEducation()!=null) {
				doctor1.setEducation(doctor.getEducation());
			}
			if(doctor.getEmail()!=null) {
				doctor1.setEmail(doctor.getEmail());
			}
			if(doctor.getSpecialization()!=null) {
				doctor1.setSpecialization(doctor.getSpecialization());
			}
	    }
	    return doctorRepository.saveAll(doc);
	}
}
