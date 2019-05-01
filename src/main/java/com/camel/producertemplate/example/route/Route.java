package com.camel.producertemplate.example.route;

import org.apache.camel.builder.RouteBuilder;

public class Route extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		System.out.println("Inside Route.");
		from("direct:firstRoute").to("businessLogicProcessor");
	}

}
