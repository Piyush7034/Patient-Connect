package com.infy.patientconnect.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infy.patientconnect.entity.Medicine;

public interface MedicineRepository extends CrudRepository<Medicine, String> {
	List<Medicine> findByEmailId(String emailId);
}
