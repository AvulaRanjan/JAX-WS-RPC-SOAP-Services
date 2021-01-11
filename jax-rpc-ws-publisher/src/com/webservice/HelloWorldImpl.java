package com.webservice;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.webservice.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}