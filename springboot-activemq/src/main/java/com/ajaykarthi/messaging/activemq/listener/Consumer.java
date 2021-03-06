package com.ajaykarthi.messaging.activemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@JmsListener(destination = "my_queue")
	public void consume(String message) {
		System.out.println("Received Message: " + message);
	}
}
