
package com.arpit.soap.server.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.arpit.soap.server.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Arg1_QNAME = new QName("http://service.server.soap.arpit.com/", "arg1");
    private final static QName _HelloWorld_QNAME = new QName("http://service.server.soap.arpit.com/", "helloWorld");
    private final static QName _HelloWorldResponse_QNAME = new QName("http://service.server.soap.arpit.com/", "helloWorldResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.arpit.soap.server.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApplicationCredentials }
     * 
     */
    public ApplicationCredentials createApplicationCredentials() {
        return new ApplicationCredentials();
    }

    /**
     * Create an instance of {@link HelloWorldResponse }
     * 
     */
    public HelloWorldResponse createHelloWorldResponse() {
        return new HelloWorldResponse();
    }

    /**
     * Create an instance of {@link HelloWorld }
     * 
     */
    public HelloWorld createHelloWorld() {
        return new HelloWorld();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationCredentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.soap.arpit.com/", name = "arg1")
    public JAXBElement<ApplicationCredentials> createArg1(ApplicationCredentials value) {
        return new JAXBElement<ApplicationCredentials>(_Arg1_QNAME, ApplicationCredentials.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.soap.arpit.com/", name = "helloWorld")
    public JAXBElement<HelloWorld> createHelloWorld(HelloWorld value) {
        return new JAXBElement<HelloWorld>(_HelloWorld_QNAME, HelloWorld.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.soap.arpit.com/", name = "helloWorldResponse")
    public JAXBElement<HelloWorldResponse> createHelloWorldResponse(HelloWorldResponse value) {
        return new JAXBElement<HelloWorldResponse>(_HelloWorldResponse_QNAME, HelloWorldResponse.class, null, value);
    }

}
