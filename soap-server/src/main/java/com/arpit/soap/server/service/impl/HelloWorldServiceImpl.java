package com.arpit.soap.server.service.impl;

import javax.jws.WebService;

import com.arpit.soap.server.model.ApplicationCredentials;
import com.arpit.soap.server.service.HelloWorldService;

@WebService(endpointInterface = "com.arpit.soap.server.service.HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String helloWorld(final String name,
			final ApplicationCredentials credential) {
		return "Hello World from " + name;
	}
}
