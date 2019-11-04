package com.love2code.rabbitMQ.rabbitmqconsumer.consumer;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.love2code.rabbitMQ.rabbitmqconsumer.entity.Employee;

@Service
public class EmployeeJsonConsumer {
	
	private ObjectMapper mapper=new ObjectMapper();
	
	private static final Logger Log = LoggerFactory.getLogger(EmployeeJsonConsumer.class);
	
	@RabbitListener(queues="EMPLOYEE_EVENT")
	public void consumeMessage(String message) {
		try {
			Employee employee = mapper.readValue(message, Employee.class);
			Log.info("Employee is {}",employee);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
