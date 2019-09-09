package com.mindtree.Jms2;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
	
	@JmsListener(destination = "objectQueue")
	public void receive(String msg)
	{
		 System.out.println("Message Received\n\n");
		System.out.println(msg);
	}
	

}
