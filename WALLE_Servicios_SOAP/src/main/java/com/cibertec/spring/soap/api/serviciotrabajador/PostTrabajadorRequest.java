//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.11.27 a las 11:50:45 PM COT 
//


package com.cibertec.spring.soap.api.serviciotrabajador;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trabajador" type="{http://www.cibertec.com/spring/soap/api/servicioTrabajador}trabajador"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "trabajador"
})
@XmlRootElement(name = "postTrabajadorRequest")
public class PostTrabajadorRequest {

    @XmlElement(required = true)
    protected Trabajador trabajador;

    /**
     * Obtiene el valor de la propiedad trabajador.
     * 
     * @return
     *     possible object is
     *     {@link Trabajador }
     *     
     */
    public Trabajador getTrabajador() {
        return trabajador;
    }

    /**
     * Define el valor de la propiedad trabajador.
     * 
     * @param value
     *     allowed object is
     *     {@link Trabajador }
     *     
     */
    public void setTrabajador(Trabajador value) {
        this.trabajador = value;
    }

}
