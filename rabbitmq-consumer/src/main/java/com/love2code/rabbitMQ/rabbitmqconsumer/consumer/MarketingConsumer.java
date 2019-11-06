package com.love2code.rabbitMQ.rabbitmqconsumer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;


@Service
public class MarketingConsumer {

	private static final Logger log = LoggerFactory.getLogger(MarketingConsumer.class);

	@RabbitListener(queues = "q.hr.marketing")
	public void consumeMsg(String msg) {
		log.info("Consuming marketing msg {}", msg);
	}
}
