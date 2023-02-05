package com.infy.patientconnect.dto;

import jakarta.validation.constraints.NotNull;

public class MedicineDTO {
	@NotNull(message = "{medicine.emailid.absent}")
	private String emailId;
	
	@NotNull(message = "{medicine.name.absent}")
	private String name;
	
	@NotNull(message = "{medicine.cost.absent}")
	private double cost;
	
	@NotNull(message = "{medicine.type.absent}")
	private String type;
	
	@NotNull(message = "{medicine.field.absent}")
	private String field;

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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
}
