package com.camel.producertemplate.example.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class BusinessLogicProcessor implements Processor {

	int counter;

	public void process(Exchange arg0) throws Exception {
		System.out.println("Inside BusinessLogicProcessor.");

		for (counter = 0; counter < 25; counter++) {
			System.out.println("Iteration Counter : " + counter);
			Thread.sleep(1000);
		}
	}

}
