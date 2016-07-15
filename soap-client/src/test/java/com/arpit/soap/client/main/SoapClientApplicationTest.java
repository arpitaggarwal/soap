package com.arpit.soap.client.main;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.arpit.soap.client.config.ApplicationConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
@WebAppConfiguration
public class SoapClientApplicationTest {

	@InjectMocks
	private SoapClientApplication soapClientApplication = new SoapClientApplication();

	@Autowired
	private WebServiceTemplate webServiceTemplate;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		soapClientApplication.setWebServiceTemplate(webServiceTemplate);
	}

	@Test
	public void shouldGetResponseFromService() throws Exception {
		soapClientApplication.run(new String[] { "" });
	}

}
