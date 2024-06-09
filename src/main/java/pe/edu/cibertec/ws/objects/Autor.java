
package pe.edu.cibertec.ws.objects;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Clase Java para Autor complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="Autor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idAutor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomAutor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ApeAutor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechNacAutor" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Autor", propOrder = {
    "idAutor",
    "nomAutor",
    "apeAutor",
    "fechNacAutor"
})
public class Autor {

    protected int idAutor;
    @XmlElement(name = "NomAutor", required = true)
    protected String nomAutor;
    @XmlElement(name = "ApeAutor", required = true)
    protected String apeAutor;
    @XmlElement(name = "FechNacAutor", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechNacAutor;

    /**
     * Obtiene el valor de la propiedad idAutor.
     *
     */
    public int getIdAutor() {
        return idAutor;
    }

    /**
     * Define el valor de la propiedad idAutor.
     *
     */
    public void setIdAutor(int value) {
        this.idAutor = value;
    }

    /**
     * Obtiene el valor de la propiedad nomAutor.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNomAutor() {
        return nomAutor;
    }

    /**
     * Define el valor de la propiedad nomAutor.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNomAutor(String value) {
        this.nomAutor = value;
    }

    /**
     * Obtiene el valor de la propiedad apeAutor.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApeAutor() {
        return apeAutor;
    }

    /**
     * Define el valor de la propiedad apeAutor.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApeAutor(String value) {
        this.apeAutor = value;
    }

    /**
     * Obtiene el valor de la propiedad fechNacAutor.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechNacAutor() {
        return fechNacAutor;
    }

    /**
     * Define el valor de la propiedad fechNacAutor.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFechNacAutor(XMLGregorianCalendar value) {
        this.fechNacAutor = value;
    }

}
