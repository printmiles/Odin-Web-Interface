//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.28 at 03:36:22 PM BST 
//


package odin.shared.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="document" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="mimetype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="fileextension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "document"
})
@XmlRootElement(name = "mimeTypes")
public class MimeTypes {

    @XmlElement(required = true)
    protected List<MimeTypes.Document> document;

    /**
     * Gets the value of the document property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MimeTypes.Document }
     * 
     * 
     */
    public List<MimeTypes.Document> getDocument() {
        if (document == null) {
            document = new ArrayList<MimeTypes.Document>();
        }
        return this.document;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="mimetype" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="fileextension" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Document {

        @XmlElement(required = true)
        protected String mimetype;
        @XmlElement(required = true)
        protected String fileextension;

        /**
         * Gets the value of the mimetype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMimetype() {
            return mimetype;
        }

        /**
         * Sets the value of the mimetype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMimetype(String value) {
            this.mimetype = value;
        }

        /**
         * Gets the value of the fileextension property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileextension() {
            return fileextension;
        }

        /**
         * Sets the value of the fileextension property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileextension(String value) {
            this.fileextension = value;
        }

    }

}
