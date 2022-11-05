
package web.service.client.importer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour afficherOffres2 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="afficherOffres2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="arg4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg6" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="arg7" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="arg8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "afficherOffres2", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3",
    "arg4",
    "arg5",
    "arg6",
    "arg7",
    "arg8"
})
public class AfficherOffres2 {

    protected int arg0;
    protected String arg1;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arg2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arg3;
    protected int arg4;
    protected int arg5;
    protected Double arg6;
    protected Double arg7;
    protected String arg8;

    /**
     * Obtient la valeur de la propriété arg0.
     * 
     */
    public int getArg0() {
        return arg0;
    }

    /**
     * Définit la valeur de la propriété arg0.
     * 
     */
    public void setArg0(int value) {
        this.arg0 = value;
    }

    /**
     * Obtient la valeur de la propriété arg1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg1() {
        return arg1;
    }

    /**
     * Définit la valeur de la propriété arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg1(String value) {
        this.arg1 = value;
    }

    /**
     * Obtient la valeur de la propriété arg2.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArg2() {
        return arg2;
    }

    /**
     * Définit la valeur de la propriété arg2.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArg2(XMLGregorianCalendar value) {
        this.arg2 = value;
    }

    /**
     * Obtient la valeur de la propriété arg3.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArg3() {
        return arg3;
    }

    /**
     * Définit la valeur de la propriété arg3.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArg3(XMLGregorianCalendar value) {
        this.arg3 = value;
    }

    /**
     * Obtient la valeur de la propriété arg4.
     * 
     */
    public int getArg4() {
        return arg4;
    }

    /**
     * Définit la valeur de la propriété arg4.
     * 
     */
    public void setArg4(int value) {
        this.arg4 = value;
    }

    /**
     * Obtient la valeur de la propriété arg5.
     * 
     */
    public int getArg5() {
        return arg5;
    }

    /**
     * Définit la valeur de la propriété arg5.
     * 
     */
    public void setArg5(int value) {
        this.arg5 = value;
    }

    /**
     * Obtient la valeur de la propriété arg6.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getArg6() {
        return arg6;
    }

    /**
     * Définit la valeur de la propriété arg6.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setArg6(Double value) {
        this.arg6 = value;
    }

    /**
     * Obtient la valeur de la propriété arg7.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getArg7() {
        return arg7;
    }

    /**
     * Définit la valeur de la propriété arg7.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setArg7(Double value) {
        this.arg7 = value;
    }

    /**
     * Obtient la valeur de la propriété arg8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg8() {
        return arg8;
    }

    /**
     * Définit la valeur de la propriété arg8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg8(String value) {
        this.arg8 = value;
    }

}
