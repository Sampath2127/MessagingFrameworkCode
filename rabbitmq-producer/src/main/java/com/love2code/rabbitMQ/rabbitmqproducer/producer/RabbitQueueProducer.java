package com.love2code.rabbitMQ.rabbitmqproducer.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitQueueProducer {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public void sendMessage(String msg)  {
		rabbitTemplate.convertAndSend("course.hello", "Hi "+ msg);
	}

}
