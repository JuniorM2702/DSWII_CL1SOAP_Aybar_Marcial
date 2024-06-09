//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 09:46:40 PM COT 
//


package pe.edu.cibertec.ws.objects;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.Date;


/**
 * <p>Clase Java para publicacionws complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="publicacionws"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idPublicacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resumen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechPublicacion" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="idAutor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publicacionws", propOrder = {
    "idPublicacion",
    "titulo",
    "resumen",
    "fechPublicacion",
    "idAutor"
})
public class Publicacionws {

    protected int idPublicacion;
    @XmlElement(required = true)
    protected String titulo;
    @XmlElement(required = true)
    protected String resumen;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected Date fechPublicacion;
    protected int idAutor;

    /**
     * Obtiene el valor de la propiedad idPublicacion.
     * 
     */
    public int getIdPublicacion() {
        return idPublicacion;
    }

    /**
     * Define el valor de la propiedad idPublicacion.
     * 
     */
    public void setIdPublicacion(int value) {
        this.idPublicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Obtiene el valor de la propiedad resumen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResumen() {
        return resumen;
    }

    /**
     * Define el valor de la propiedad resumen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResumen(String value) {
        this.resumen = value;
    }

    /**
     * Obtiene el valor de la propiedad fechPublicacion.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public Date getFechPublicacion() {
        return fechPublicacion;
    }

    /**
     * Define el valor de la propiedad fechPublicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechPublicacion(Date value) {
        this.fechPublicacion = value;
    }

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

}
