package com.infy.patientconnect.repository;

import org.springframework.data.repository.CrudRepository;

import com.infy.patientconnect.entity.PatientReport;

public interface PatientReportRepository extends CrudRepository<PatientReport, String> {
	PatientReport findByEmailId(String emailId);
}
