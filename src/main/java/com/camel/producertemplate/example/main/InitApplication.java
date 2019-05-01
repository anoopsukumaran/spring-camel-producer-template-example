package com.camel.producertemplate.example.main;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitApplication {

	public static void main(String[] args) {
		
		ApplicationContext springCtx = new ClassPathXmlApplicationContext("application-context.xml");
		CamelContext context = springCtx.getBean("camelContext", CamelContext.class);
		System.out.println("Camel Context Initialized.");

		try {
			context.start();
			ProducerTemplate producerTemplate = context.createProducerTemplate();
			producerTemplate.sendBody("direct:firstRoute", "Hello Message !");
			context.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
