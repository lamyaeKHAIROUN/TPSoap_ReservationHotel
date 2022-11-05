
package web.service.client.reservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour offre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="offre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chambreTrv" type="{http://service.example.com/}chambre" minOccurs="0"/>
 *         &lt;element name="hotelTrv" type="{http://service.example.com/}hotel" minOccurs="0"/>
 *         &lt;element name="idOffre" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offre", propOrder = {
    "chambreTrv",
    "hotelTrv",
    "idOffre"
})
public class Offre {

    protected Chambre chambreTrv;
    protected Hotel hotelTrv;
    protected int idOffre;

    /**
     * Obtient la valeur de la propriété chambreTrv.
     * 
     * @return
     *     possible object is
     *     {@link Chambre }
     *     
     */
    public Chambre getChambreTrv() {
        return chambreTrv;
    }

    /**
     * Définit la valeur de la propriété chambreTrv.
     * 
     * @param value
     *     allowed object is
     *     {@link Chambre }
     *     
     */
    public void setChambreTrv(Chambre value) {
        this.chambreTrv = value;
    }

    /**
     * Obtient la valeur de la propriété hotelTrv.
     * 
     * @return
     *     possible object is
     *     {@link Hotel }
     *     
     */
    public Hotel getHotelTrv() {
        return hotelTrv;
    }

    /**
     * Définit la valeur de la propriété hotelTrv.
     * 
     * @param value
     *     allowed object is
     *     {@link Hotel }
     *     
     */
    public void setHotelTrv(Hotel value) {
        this.hotelTrv = value;
    }

    /**
     * Obtient la valeur de la propriété idOffre.
     * 
     */
    public int getIdOffre() {
        return idOffre;
    }

    /**
     * Définit la valeur de la propriété idOffre.
     * 
     */
    public void setIdOffre(int value) {
        this.idOffre = value;
    }

}
