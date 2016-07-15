package com.arpit.soap.client.main;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBElement;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.xml.transform.StringSource;

import com.arpit.soap.server.service.ApplicationCredentials;
import com.arpit.soap.server.service.HelloWorld;
import com.arpit.soap.server.service.HelloWorldResponse;
import com.arpit.soap.server.service.ObjectFactory;

@SpringBootApplication
@ComponentScan("com.arpit.soap.client.config")
public class SoapClientApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("webServiceTemplate")
	private WebServiceTemplate webServiceTemplate;

	@Value("#{'${service.soap.action}'}")
	private String serviceSoapAction;

	@Value("#{'${service.user.id}'}")
	private String serviceUserId;

	@Value("#{'${service.user.password}'}")
	private String serviceUserPassword;

	public static void main(String[] args) {
		SpringApplication.run(SoapClientApplication.class, args);
		System.exit(0);
	}

	public void run(String... args) throws Exception {
		final HelloWorld helloWorld = createHelloWorldRequest();
		@SuppressWarnings("unchecked")
		final JAXBElement<HelloWorldResponse> jaxbElement = (JAXBElement<HelloWorldResponse>) sendAndRecieve(helloWorld);
		final HelloWorldResponse helloWorldResponse = jaxbElement.getValue();
		System.out.println(helloWorldResponse.getReturn());
	}

	private Object sendAndRecieve(HelloWorld seatMapRequestType) {
		return webServiceTemplate.marshalSendAndReceive(seatMapRequestType,
				new WebServiceMessageCallback() {
					public void doWithMessage(WebServiceMessage message)
							throws IOException, TransformerException {
						SoapMessage soapMessage = (SoapMessage) message;
						soapMessage.setSoapAction(serviceSoapAction);
						org.springframework.ws.soap.SoapHeader soapheader = soapMessage
								.getSoapHeader();
						final StringWriter out = new StringWriter();
						webServiceTemplate.getMarshaller().marshal(
								getHeader(serviceUserId, serviceUserPassword),
								new StreamResult(out));
						Transformer transformer = TransformerFactory
								.newInstance().newTransformer();
						transformer.transform(new StringSource(out.toString()),
								soapheader.getResult());
					}
				});
	}

	private Object getHeader(final String userId, final String password) {
		final https.aggarwalarpit_wordpress.ObjectFactory headerObjectFactory = new https.aggarwalarpit_wordpress.ObjectFactory();
		final ApplicationCredentials applicationCredentials = new ApplicationCredentials();
		applicationCredentials.setUserId(userId);
		applicationCredentials.setPassword(password);
		final JAXBElement<ApplicationCredentials> header = headerObjectFactory
				.createApplicationCredentials(applicationCredentials);
		return header;
	}

	private HelloWorld createHelloWorldRequest() {
		final ObjectFactory objectFactory = new ObjectFactory();
		final HelloWorld helloWorld = objectFactory.createHelloWorld();
		helloWorld.setArg0("Arpit");
		return helloWorld;
	}

	public void setWebServiceTemplate(final WebServiceTemplate template) {
		this.webServiceTemplate = template;
	}

}
