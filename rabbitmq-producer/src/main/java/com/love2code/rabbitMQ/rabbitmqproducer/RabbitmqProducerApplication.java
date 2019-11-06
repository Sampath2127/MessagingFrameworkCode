package com.love2code.rabbitMQ.rabbitmqproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.love2code.rabbitMQ.rabbitmqproducer.entity.Employee;
import com.love2code.rabbitMQ.rabbitmqproducer.producer.HumanResourceProducer;
import com.love2code.rabbitMQ.rabbitmqproducer.producer.RabbitQueueProducer;
import com.rabbitmq.tools.json.JSONWriter;

@SpringBootApplication
//@EnableScheduling
public class RabbitmqProducerApplication implements CommandLineRunner{	
//	@Autowired
//	private RabbitQueueProducer rabbitProducer;
	
	@Autowired
	private HumanResourceProducer rabbitProducer;

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		rabbitProducer.sendMessage("Sam");
		for(int i=0; i<5; i++) {
			Employee e=new Employee("emp_"+i,"emp_name_"+i);
			
			rabbitProducer.sendMessage(e);
		}
		
	}

}
