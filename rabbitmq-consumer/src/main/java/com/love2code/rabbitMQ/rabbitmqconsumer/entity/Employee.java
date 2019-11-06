package com.love2code.rabbitMQ.rabbitmqconsumer.entity;

import org.springframework.boot.context.properties.ConstructorBinding;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data @Getter @Setter 
@EqualsAndHashCode
@ToString
public class Employee {

	@JsonProperty("employee_id")
	private String empId;
	
	@JsonProperty("employee_name")
	private String empName;
	
	public Employee(String empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	
	
}
