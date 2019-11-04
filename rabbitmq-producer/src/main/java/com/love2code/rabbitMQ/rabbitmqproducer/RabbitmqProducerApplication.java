package com.love2code.rabbitMQ.rabbitmqproducer;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.love2code.rabbitMQ.rabbitmqproducer.entity.Employee;
import com.love2code.rabbitMQ.rabbitmqproducer.producer.EmployeeJsonProducer;
import com.love2code.rabbitMQ.rabbitmqproducer.producer.RabbitQueueProducer;

@SpringBootApplication
//@EnableScheduling
public class RabbitmqProducerApplication implements CommandLineRunner {
//	@Autowired
//	private RabbitQueueProducer rabbitProducer;

	@Autowired
	private EmployeeJsonProducer employeeJsonProducer;

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		rabbitProducer.sendMessage("Sam");
		for(int i=0; i<5; i++) {
			Employee e = new Employee("employee_"+i, "emp_name_"+i, LocalDate.now());
			employeeJsonProducer.sendMessage(e);
		}

	}

}
