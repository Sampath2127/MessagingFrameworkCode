package com.love2code.rabbitMQ.rabbitmqconsumer.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.love2code.rabbitMQ.rabbitmqproducer.jsoncustomized.CustomLocalDateDeserializer;

public class Employee {

	@JsonProperty("employee_id")
	private String empId;

	private String name;

	@JsonProperty("birth_date")
	@JsonDeserialize(using = CustomLocalDateDeserializer.class)
	private LocalDate dob;
	
	public Employee() {
		
	}

	public Employee(String empId, String name, LocalDate dob) {
		this.empId = empId;
		this.name = name;
		this.dob = dob;
	}

	public LocalDate getDob() {
		return dob;
	}

	public String getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dob=" + dob + "]";
	}
}
