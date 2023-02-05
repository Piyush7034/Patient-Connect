package com.infy.patientconnect.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class PatientDTO {
	@NotNull(message = "Email Id is required!")
	@Pattern(regexp = "[a-zA-Z0-9._]+@[a-zA-Z]{2,}\\.[a-zA-Z][a-zA-Z.]+", message = "Email Id is invalid!")
	private String emailId;
	
	@NotNull(message = "Email Id is required!")
	@Pattern(regexp = "([A-Za-z])+(\\s[A-Za-z]+)*", message = "Name is invalid!")
	private String name;
	
	@NotNull(message = "{password.absent}")
	@Pattern(regexp = ".*[A-Z]+.*", message = "{invalid.password.format.uppercase}")
	@Pattern(regexp = ".*[a-z]+.*", message = "{invalid.password.format.lowercase}")
	@Pattern(regexp = ".*[0-9]+.*", message = "{invalid.password.format.number}")
	@Pattern(regexp = ".*[^a-zA-Z-0-9]+.*", message = "{invalid.password.format.specialcharacter}")
	private String password;
	
	@Size(max = 10, min = 10, message="{patient.invalid.phoneNumber}")
	@Pattern(regexp = "[0-9]+", message = "{patient.invalid.phoneNumber}")
	private String phoneNumber;
	
	@NotNull(message="{patient.address.absent}")
	private String address;
	
	@NotNull(message="Gender is required!")
	@Pattern(regexp = "(male|female|other)", message = "Gender should be male or female or other")
	private String gender;
	
	@NotNull(message = "Age is required!")
	@Min(value = 0)
	private Integer age;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
}
