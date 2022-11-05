
package web.service.client.reservation;

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
@WebServiceClient(name = "webSeviceReservationImplService", targetNamespace = "http://service.example.com/", wsdlLocation = "http://localhost:8080/webserviceReservation?wsdl")
public class WebSeviceReservationImplService
    extends Service
{

    private final static URL WEBSEVICERESERVATIONIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException WEBSEVICERESERVATIONIMPLSERVICE_EXCEPTION;
    private final static QName WEBSEVICERESERVATIONIMPLSERVICE_QNAME = new QName("http://service.example.com/", "webSeviceReservationImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/webserviceReservation?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSEVICERESERVATIONIMPLSERVICE_WSDL_LOCATION = url;
        WEBSEVICERESERVATIONIMPLSERVICE_EXCEPTION = e;
    }

    public WebSeviceReservationImplService() {
        super(__getWsdlLocation(), WEBSEVICERESERVATIONIMPLSERVICE_QNAME);
    }

    public WebSeviceReservationImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSEVICERESERVATIONIMPLSERVICE_QNAME, features);
    }

    public WebSeviceReservationImplService(URL wsdlLocation) {
        super(wsdlLocation, WEBSEVICERESERVATIONIMPLSERVICE_QNAME);
    }

    public WebSeviceReservationImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSEVICERESERVATIONIMPLSERVICE_QNAME, features);
    }

    public WebSeviceReservationImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebSeviceReservationImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebSeviceReservation
     */
    @WebEndpoint(name = "webSeviceReservationImplPort")
    public WebSeviceReservation getWebSeviceReservationImplPort() {
        return super.getPort(new QName("http://service.example.com/", "webSeviceReservationImplPort"), WebSeviceReservation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebSeviceReservation
     */
    @WebEndpoint(name = "webSeviceReservationImplPort")
    public WebSeviceReservation getWebSeviceReservationImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.example.com/", "webSeviceReservationImplPort"), WebSeviceReservation.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSEVICERESERVATIONIMPLSERVICE_EXCEPTION!= null) {
            throw WEBSEVICERESERVATIONIMPLSERVICE_EXCEPTION;
        }
        return WEBSEVICERESERVATIONIMPLSERVICE_WSDL_LOCATION;
    }

}
