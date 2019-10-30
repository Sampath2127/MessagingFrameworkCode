package com.love2code.rabbitMQ.rabbitmqconsumer.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

//@Service
public class RabbitConsumer {

	@RabbitListener(queues="course.hello")
	public void consumeMsg(String msg) {
		System.out.println("Consumed message "+msg);
	}
}
