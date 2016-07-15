package com.arpit.soap.server.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.arpit.soap.server.model.ApplicationCredentials;

@WebService
public interface HelloWorldService {

	@WebMethod(operationName = "helloWorld", action = "https://aggarwalarpit.wordpress.com/hello-world/helloWorld")
	String helloWorld(final String name,
			@WebParam(header = true) final ApplicationCredentials credential);

}
