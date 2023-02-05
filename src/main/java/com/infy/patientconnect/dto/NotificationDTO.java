package com.infy.patientconnect.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.validation.constraints.NotNull;

public class NotificationDTO {
	@NotNull(message = "Email is mandatory!")
	private String emailId;
	
	@NotNull(message = "Date is mandatory!")
	private LocalDate date;
	
	@NotNull(message = "Time is mandatory!")
	private LocalTime time;
	
	@NotNull(message = "Subject is mandatory!")
	private String subject;
	
	@NotNull(message = "Message is mandatory!")
	private String message;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
