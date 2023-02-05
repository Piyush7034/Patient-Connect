package com.infy.patientconnect.repository;

import org.springframework.data.repository.CrudRepository;

import com.infy.patientconnect.entity.Patient;

public interface PatientRepository extends CrudRepository<Patient, String> {
	Patient findByEmailId(String emailId);
}
