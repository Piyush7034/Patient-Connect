package com.infy.patientconnect.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infy.patientconnect.entity.Notification;

public interface NotificationRepository extends CrudRepository<Notification, String> {
	List<Notification> findByEmailId(String emailId);
}
