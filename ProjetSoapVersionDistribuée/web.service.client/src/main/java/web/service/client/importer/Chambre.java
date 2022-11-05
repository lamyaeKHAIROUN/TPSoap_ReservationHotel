
package web.service.client.importer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour chambre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="chambre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateDisponabilite" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="estDispo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="idChambre" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idHotel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbrPers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbrlits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="reservations" type="{http://service.example.com/}reservation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chambre", propOrder = {
    "dateDisponabilite",
    "estDispo",
    "idChambre",
    "idHotel",
    "nbrPers",
    "nbrlits",
    "prix",
    "reservations"
})
public class Chambre {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDisponabilite;
    protected boolean estDispo;
    protected int idChambre;
    protected int idHotel;
    protected int nbrPers;
    protected int nbrlits;
    protected Double prix;
    @XmlElement(nillable = true)
    protected List<Reservation> reservations;

    /**
     * Obtient la valeur de la propriété dateDisponabilite.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDisponabilite() {
        return dateDisponabilite;
    }

    /**
     * Définit la valeur de la propriété dateDisponabilite.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDisponabilite(XMLGregorianCalendar value) {
        this.dateDisponabilite = value;
    }

    /**
     * Obtient la valeur de la propriété estDispo.
     * 
     */
    public boolean isEstDispo() {
        return estDispo;
    }

    /**
     * Définit la valeur de la propriété estDispo.
     * 
     */
    public void setEstDispo(boolean value) {
        this.estDispo = value;
    }

    /**
     * Obtient la valeur de la propriété idChambre.
     * 
     */
    public int getIdChambre() {
        return idChambre;
    }

    /**
     * Définit la valeur de la propriété idChambre.
     * 
     */
    public void setIdChambre(int value) {
        this.idChambre = value;
    }

    /**
     * Obtient la valeur de la propriété idHotel.
     * 
     */
    public int getIdHotel() {
        return idHotel;
    }

    /**
     * Définit la valeur de la propriété idHotel.
     * 
     */
    public void setIdHotel(int value) {
        this.idHotel = value;
    }

    /**
     * Obtient la valeur de la propriété nbrPers.
     * 
     */
    public int getNbrPers() {
        return nbrPers;
    }

    /**
     * Définit la valeur de la propriété nbrPers.
     * 
     */
    public void setNbrPers(int value) {
        this.nbrPers = value;
    }

    /**
     * Obtient la valeur de la propriété nbrlits.
     * 
     */
    public int getNbrlits() {
        return nbrlits;
    }

    /**
     * Définit la valeur de la propriété nbrlits.
     * 
     */
    public void setNbrlits(int value) {
        this.nbrlits = value;
    }

    /**
     * Obtient la valeur de la propriété prix.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrix() {
        return prix;
    }

    /**
     * Définit la valeur de la propriété prix.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrix(Double value) {
        this.prix = value;
    }

    /**
     * Gets the value of the reservations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reservation }
     * 
     * 
     */
    public List<Reservation> getReservations() {
        if (reservations == null) {
            reservations = new ArrayList<Reservation>();
        }
        return this.reservations;
    }

}
