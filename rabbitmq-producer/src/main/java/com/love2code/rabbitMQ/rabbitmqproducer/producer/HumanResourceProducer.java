package com.love2code.rabbitMQ.rabbitmqproducer.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.love2code.rabbitMQ.rabbitmqproducer.entity.Employee;

@Service
public class HumanResourceProducer {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	private ObjectMapper objectMapper = new ObjectMapper();
	
	public void sendMessage(Employee emp)  {
		try {
			String json = objectMapper.writeValueAsString(emp);
			rabbitTemplate.convertAndSend("x.hr","",json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
	}

}
