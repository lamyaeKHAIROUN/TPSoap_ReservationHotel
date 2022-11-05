
package web.service.client.importer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour hotel complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="hotel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chambreRes" type="{http://service.example.com/}chambre" minOccurs="0"/>
 *         &lt;element name="listeChambre" type="{http://service.example.com/}chambre" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nbEtoile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nomHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="positionGps" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotel", propOrder = {
    "chambreRes",
    "listeChambre",
    "nbEtoile",
    "nomHotel",
    "numero",
    "pays",
    "positionGps",
    "rue",
    "ville"
})
public class Hotel {

    protected Chambre chambreRes;
    @XmlElement(nillable = true)
    protected List<Chambre> listeChambre;
    protected int nbEtoile;
    protected String nomHotel;
    protected int numero;
    protected String pays;
    protected int positionGps;
    protected String rue;
    protected String ville;

    /**
     * Obtient la valeur de la propriété chambreRes.
     * 
     * @return
     *     possible object is
     *     {@link Chambre }
     *     
     */
    public Chambre getChambreRes() {
        return chambreRes;
    }

    /**
     * Définit la valeur de la propriété chambreRes.
     * 
     * @param value
     *     allowed object is
     *     {@link Chambre }
     *     
     */
    public void setChambreRes(Chambre value) {
        this.chambreRes = value;
    }

    /**
     * Gets the value of the listeChambre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeChambre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListeChambre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Chambre }
     * 
     * 
     */
    public List<Chambre> getListeChambre() {
        if (listeChambre == null) {
            listeChambre = new ArrayList<Chambre>();
        }
        return this.listeChambre;
    }

    /**
     * Obtient la valeur de la propriété nbEtoile.
     * 
     */
    public int getNbEtoile() {
        return nbEtoile;
    }

    /**
     * Définit la valeur de la propriété nbEtoile.
     * 
     */
    public void setNbEtoile(int value) {
        this.nbEtoile = value;
    }

    /**
     * Obtient la valeur de la propriété nomHotel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomHotel() {
        return nomHotel;
    }

    /**
     * Définit la valeur de la propriété nomHotel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomHotel(String value) {
        this.nomHotel = value;
    }

    /**
     * Obtient la valeur de la propriété numero.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Définit la valeur de la propriété numero.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Obtient la valeur de la propriété pays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPays() {
        return pays;
    }

    /**
     * Définit la valeur de la propriété pays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPays(String value) {
        this.pays = value;
    }

    /**
     * Obtient la valeur de la propriété positionGps.
     * 
     */
    public int getPositionGps() {
        return positionGps;
    }

    /**
     * Définit la valeur de la propriété positionGps.
     * 
     */
    public void setPositionGps(int value) {
        this.positionGps = value;
    }

    /**
     * Obtient la valeur de la propriété rue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRue() {
        return rue;
    }

    /**
     * Définit la valeur de la propriété rue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRue(String value) {
        this.rue = value;
    }

    /**
     * Obtient la valeur de la propriété ville.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVille() {
        return ville;
    }

    /**
     * Définit la valeur de la propriété ville.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVille(String value) {
        this.ville = value;
    }

}
