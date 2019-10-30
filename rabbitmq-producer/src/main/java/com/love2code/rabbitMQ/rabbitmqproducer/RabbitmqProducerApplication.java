package com.love2code.rabbitMQ.rabbitmqproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.love2code.rabbitMQ.rabbitmqproducer.producer.RabbitQueueProducer;

@SpringBootApplication
@EnableScheduling
public class RabbitmqProducerApplication implements CommandLineRunner{	
//	@Autowired
//	private RabbitQueueProducer rabbitProducer;

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		rabbitProducer.sendMessage("Sam");
		
	}

}
