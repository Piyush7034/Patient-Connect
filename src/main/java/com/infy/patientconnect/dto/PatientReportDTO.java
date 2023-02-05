package com.infy.patientconnect.dto;

import jakarta.validation.constraints.NotNull;

public class PatientReportDTO {
	@NotNull(message =  "Email Id is required!")
	private String emailId;
	
	@NotNull(message =  "Name is required!")
	private String name;
	
	@NotNull(message =  "Gender is required!")
	private String gender;
	
	@NotNull(message =  "Age is required!")
	private Integer age;
	
	@NotNull(message =  "Weight is required!")
	private Double weight;
	
	@NotNull(message =  "Height is required!")
	private Double height;
	
	@NotNull(message =  "Blood Group is required!")
	private String bloodGroup;
	
	private String glucoseFasting;
	
	private String cholesterol;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getGlucoseFasting() {
		return glucoseFasting;
	}

	public void setGlucoseFasting(String glucoseFasting) {
		this.glucoseFasting = glucoseFasting;
	}

	public String getCholesterol() {
		return cholesterol;
	}

	public void setCholesterol(String cholesterol) {
		this.cholesterol = cholesterol;
	}
}
