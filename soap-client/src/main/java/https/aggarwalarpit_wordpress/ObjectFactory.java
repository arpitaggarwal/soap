
package https.aggarwalarpit_wordpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.arpit.soap.server.service.ApplicationCredentials;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.aggarwalarpit_wordpress package. 
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

    private final static QName _ApplicationCredentials_QNAME = new QName("https://aggarwalarpit.wordpress.com", "ApplicationCredentials");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.aggarwalarpit_wordpress
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationCredentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://aggarwalarpit.wordpress.com", name = "ApplicationCredentials")
    public JAXBElement<ApplicationCredentials> createApplicationCredentials(ApplicationCredentials value) {
        return new JAXBElement<ApplicationCredentials>(_ApplicationCredentials_QNAME, ApplicationCredentials.class, null, value);
    }

}
