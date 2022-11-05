
package web.service.client.reservation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the web.service.client.reservation package. 
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

    private final static QName _AjouterReservationResponse_QNAME = new QName("http://service.example.com/", "ajouterReservationResponse");
    private final static QName _SupprimerReservation_QNAME = new QName("http://service.example.com/", "supprimerReservation");
    private final static QName _SupprimerReservationResponse_QNAME = new QName("http://service.example.com/", "supprimerReservationResponse");
    private final static QName _AjouterReservation_QNAME = new QName("http://service.example.com/", "ajouterReservation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: web.service.client.reservation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SupprimerReservationResponse }
     * 
     */
    public SupprimerReservationResponse createSupprimerReservationResponse() {
        return new SupprimerReservationResponse();
    }

    /**
     * Create an instance of {@link AjouterReservation }
     * 
     */
    public AjouterReservation createAjouterReservation() {
        return new AjouterReservation();
    }

    /**
     * Create an instance of {@link AjouterReservationResponse }
     * 
     */
    public AjouterReservationResponse createAjouterReservationResponse() {
        return new AjouterReservationResponse();
    }

    /**
     * Create an instance of {@link SupprimerReservation }
     * 
     */
    public SupprimerReservation createSupprimerReservation() {
        return new SupprimerReservation();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "ajouterReservationResponse")
    public JAXBElement<AjouterReservationResponse> createAjouterReservationResponse(AjouterReservationResponse value) {
        return new JAXBElement<AjouterReservationResponse>(_AjouterReservationResponse_QNAME, AjouterReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "supprimerReservation")
    public JAXBElement<SupprimerReservation> createSupprimerReservation(SupprimerReservation value) {
        return new JAXBElement<SupprimerReservation>(_SupprimerReservation_QNAME, SupprimerReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "supprimerReservationResponse")
    public JAXBElement<SupprimerReservationResponse> createSupprimerReservationResponse(SupprimerReservationResponse value) {
        return new JAXBElement<SupprimerReservationResponse>(_SupprimerReservationResponse_QNAME, SupprimerReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "ajouterReservation")
    public JAXBElement<AjouterReservation> createAjouterReservation(AjouterReservation value) {
        return new JAXBElement<AjouterReservation>(_AjouterReservation_QNAME, AjouterReservation.class, null, value);
    }

}
