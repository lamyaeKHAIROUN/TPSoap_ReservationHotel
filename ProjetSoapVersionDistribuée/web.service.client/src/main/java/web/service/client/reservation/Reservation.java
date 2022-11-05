
package web.service.client.reservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour reservation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="client" type="{http://service.example.com/}client" minOccurs="0"/>
 *         &lt;element name="dateDebutSejour" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateFinSejour" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idReservation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="inLits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="inPers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prixNuit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="prixTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservation", propOrder = {
    "client",
    "dateDebutSejour",
    "dateFinSejour",
    "idReservation",
    "inLits",
    "inPers",
    "prixNuit",
    "prixTotal"
})
public class Reservation {

    protected Client client;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDebutSejour;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinSejour;
    protected int idReservation;
    protected int inLits;
    protected int inPers;
    protected Double prixNuit;
    protected Double prixTotal;

    /**
     * Obtient la valeur de la propriété client.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Définit la valeur de la propriété client.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Obtient la valeur de la propriété dateDebutSejour.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDebutSejour() {
        return dateDebutSejour;
    }

    /**
     * Définit la valeur de la propriété dateDebutSejour.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDebutSejour(XMLGregorianCalendar value) {
        this.dateDebutSejour = value;
    }

    /**
     * Obtient la valeur de la propriété dateFinSejour.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFinSejour() {
        return dateFinSejour;
    }

    /**
     * Définit la valeur de la propriété dateFinSejour.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFinSejour(XMLGregorianCalendar value) {
        this.dateFinSejour = value;
    }

    /**
     * Obtient la valeur de la propriété idReservation.
     * 
     */
    public int getIdReservation() {
        return idReservation;
    }

    /**
     * Définit la valeur de la propriété idReservation.
     * 
     */
    public void setIdReservation(int value) {
        this.idReservation = value;
    }

    /**
     * Obtient la valeur de la propriété inLits.
     * 
     */
    public int getInLits() {
        return inLits;
    }

    /**
     * Définit la valeur de la propriété inLits.
     * 
     */
    public void setInLits(int value) {
        this.inLits = value;
    }

    /**
     * Obtient la valeur de la propriété inPers.
     * 
     */
    public int getInPers() {
        return inPers;
    }

    /**
     * Définit la valeur de la propriété inPers.
     * 
     */
    public void setInPers(int value) {
        this.inPers = value;
    }

    /**
     * Obtient la valeur de la propriété prixNuit.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrixNuit() {
        return prixNuit;
    }

    /**
     * Définit la valeur de la propriété prixNuit.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrixNuit(Double value) {
        this.prixNuit = value;
    }

    /**
     * Obtient la valeur de la propriété prixTotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrixTotal() {
        return prixTotal;
    }

    /**
     * Définit la valeur de la propriété prixTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrixTotal(Double value) {
        this.prixTotal = value;
    }

}
