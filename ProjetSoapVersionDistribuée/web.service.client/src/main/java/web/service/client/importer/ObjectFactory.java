
package web.service.client.importer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the web.service.client.importer package. 
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

    private final static QName _AfficherOffres2_QNAME = new QName("http://service.example.com/", "afficherOffres2");
    private final static QName _AfficherOffres2Response_QNAME = new QName("http://service.example.com/", "afficherOffres2Response");
    private final static QName _Exception_QNAME = new QName("http://service.example.com/", "Exception");
    private final static QName _SetOffreResponse_QNAME = new QName("http://service.example.com/", "setOffreResponse");
    private final static QName _GetOffreResponse_QNAME = new QName("http://service.example.com/", "getOffreResponse");
    private final static QName _SetOffre_QNAME = new QName("http://service.example.com/", "setOffre");
    private final static QName _GetOffre_QNAME = new QName("http://service.example.com/", "getOffre");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: web.service.client.importer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOffreResponse }
     * 
     */
    public GetOffreResponse createGetOffreResponse() {
        return new GetOffreResponse();
    }

    /**
     * Create an instance of {@link SetOffreResponse }
     * 
     */
    public SetOffreResponse createSetOffreResponse() {
        return new SetOffreResponse();
    }

    /**
     * Create an instance of {@link GetOffre }
     * 
     */
    public GetOffre createGetOffre() {
        return new GetOffre();
    }

    /**
     * Create an instance of {@link SetOffre }
     * 
     */
    public SetOffre createSetOffre() {
        return new SetOffre();
    }

    /**
     * Create an instance of {@link AfficherOffres2 }
     * 
     */
    public AfficherOffres2 createAfficherOffres2() {
        return new AfficherOffres2();
    }

    /**
     * Create an instance of {@link AfficherOffres2Response }
     * 
     */
    public AfficherOffres2Response createAfficherOffres2Response() {
        return new AfficherOffres2Response();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
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
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link Offre }
     * 
     */
    public Offre createOffre() {
        return new Offre();
    }

    /**
     * Create an instance of {@link Chambre }
     * 
     */
    public Chambre createChambre() {
        return new Chambre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherOffres2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "afficherOffres2")
    public JAXBElement<AfficherOffres2> createAfficherOffres2(AfficherOffres2 value) {
        return new JAXBElement<AfficherOffres2>(_AfficherOffres2_QNAME, AfficherOffres2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherOffres2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "afficherOffres2Response")
    public JAXBElement<AfficherOffres2Response> createAfficherOffres2Response(AfficherOffres2Response value) {
        return new JAXBElement<AfficherOffres2Response>(_AfficherOffres2Response_QNAME, AfficherOffres2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetOffreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "setOffreResponse")
    public JAXBElement<SetOffreResponse> createSetOffreResponse(SetOffreResponse value) {
        return new JAXBElement<SetOffreResponse>(_SetOffreResponse_QNAME, SetOffreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOffreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "getOffreResponse")
    public JAXBElement<GetOffreResponse> createGetOffreResponse(GetOffreResponse value) {
        return new JAXBElement<GetOffreResponse>(_GetOffreResponse_QNAME, GetOffreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetOffre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "setOffre")
    public JAXBElement<SetOffre> createSetOffre(SetOffre value) {
        return new JAXBElement<SetOffre>(_SetOffre_QNAME, SetOffre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOffre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "getOffre")
    public JAXBElement<GetOffre> createGetOffre(GetOffre value) {
        return new JAXBElement<GetOffre>(_GetOffre_QNAME, GetOffre.class, null, value);
    }

}
