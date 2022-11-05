
package web.service.client.importer;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WebserviceImplServiceService", targetNamespace = "http://service.example.com/", wsdlLocation = "http://localhost:8080/servicewebSOAPHotel?wsdl")
public class WebserviceImplServiceService
    extends Service
{

    private final static URL WEBSERVICEIMPLSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICEIMPLSERVICESERVICE_EXCEPTION;
    private final static QName WEBSERVICEIMPLSERVICESERVICE_QNAME = new QName("http://service.example.com/", "WebserviceImplServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/servicewebSOAPHotel?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICEIMPLSERVICESERVICE_WSDL_LOCATION = url;
        WEBSERVICEIMPLSERVICESERVICE_EXCEPTION = e;
    }

    public WebserviceImplServiceService() {
        super(__getWsdlLocation(), WEBSERVICEIMPLSERVICESERVICE_QNAME);
    }

    public WebserviceImplServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICEIMPLSERVICESERVICE_QNAME, features);
    }

    public WebserviceImplServiceService(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICEIMPLSERVICESERVICE_QNAME);
    }

    public WebserviceImplServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICEIMPLSERVICESERVICE_QNAME, features);
    }

    public WebserviceImplServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebserviceImplServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebServiceDisponabilite
     */
    @WebEndpoint(name = "WebserviceImplServicePort")
    public WebServiceDisponabilite getWebserviceImplServicePort() {
        return super.getPort(new QName("http://service.example.com/", "WebserviceImplServicePort"), WebServiceDisponabilite.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceDisponabilite
     */
    @WebEndpoint(name = "WebserviceImplServicePort")
    public WebServiceDisponabilite getWebserviceImplServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.example.com/", "WebserviceImplServicePort"), WebServiceDisponabilite.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICEIMPLSERVICESERVICE_EXCEPTION!= null) {
            throw WEBSERVICEIMPLSERVICESERVICE_EXCEPTION;
        }
        return WEBSERVICEIMPLSERVICESERVICE_WSDL_LOCATION;
    }

}
