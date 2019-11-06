package com.love2code.rabbitMQ.rabbitmqconsumer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class AccountingConsumer {
	
	private static final Logger log= LoggerFactory.getLogger(AccountingConsumer.class);

	@RabbitListener(queues="q.hr.accounting")
	public void consumeMsg(String msg) {
	
		log.info("msg accounting consumer {} ",msg);
	}
}
