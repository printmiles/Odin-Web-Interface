
package odin.odin.ws.jaxws;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="status">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="appendix" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="trust" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="trust" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="alternatives" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="info" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="sleipnirUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                                       &lt;element name="odinUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                                       &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                                       &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="adminName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="barcodeUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                                       &lt;element name="subjects">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="policies">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="zip">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="reject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="store" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                           &lt;element name="extract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="xml">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="reject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                                           &lt;element name="all" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                                           &lt;element name="namespace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="trust">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;all>
 *                                                           &lt;element name="reject" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                                           &lt;element name="accept" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                                         &lt;/all>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
@XmlType(name = "uploadResponse", propOrder = {
    "_return"
})
public class UploadResponse {

    @XmlElement(name = "return")
    protected UploadResponse.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link UploadResponse.Return }
     *     
     */
    public UploadResponse.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadResponse.Return }
     *     
     */
    public void setReturn(UploadResponse.Return value) {
        this._return = value;
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
     *       &lt;sequence>
     *         &lt;element name="status">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="appendix" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="trust" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="trust" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="alternatives" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="info" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="sleipnirUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *                             &lt;element name="odinUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *                             &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *                             &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="adminName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="barcodeUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *                             &lt;element name="subjects">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="policies">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="zip">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="reject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="store" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="extract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="xml">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="reject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                                                 &lt;element name="all" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                                                 &lt;element name="namespace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="trust">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;all>
     *                                                 &lt;element name="reject" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                                                 &lt;element name="accept" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                                               &lt;/all>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
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
        "status",
        "appendix"
    })
    public static class Return {

        @XmlElement(required = true)
        protected UploadResponse.Return.Status status;
        protected UploadResponse.Return.Appendix appendix;

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link UploadResponse.Return.Status }
         *     
         */
        public UploadResponse.Return.Status getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link UploadResponse.Return.Status }
         *     
         */
        public void setStatus(UploadResponse.Return.Status value) {
            this.status = value;
        }

        /**
         * Gets the value of the appendix property.
         * 
         * @return
         *     possible object is
         *     {@link UploadResponse.Return.Appendix }
         *     
         */
        public UploadResponse.Return.Appendix getAppendix() {
            return appendix;
        }

        /**
         * Sets the value of the appendix property.
         * 
         * @param value
         *     allowed object is
         *     {@link UploadResponse.Return.Appendix }
         *     
         */
        public void setAppendix(UploadResponse.Return.Appendix value) {
            this.appendix = value;
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
         *       &lt;sequence>
         *         &lt;element name="guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="trust" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="trust" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="alternatives" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="info" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="sleipnirUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
         *                   &lt;element name="odinUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
         *                   &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
         *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="adminName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="barcodeUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
         *                   &lt;element name="subjects">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="policies">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="zip">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="reject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="store" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="extract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="xml">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="reject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                                       &lt;element name="all" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                                       &lt;element name="namespace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="trust">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;all>
         *                                       &lt;element name="reject" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                                       &lt;element name="accept" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                                     &lt;/all>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
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
            "guid",
            "trust",
            "info"
        })
        public static class Appendix {

            protected String guid;
            protected UploadResponse.Return.Appendix.Trust trust;
            protected UploadResponse.Return.Appendix.Info info;

            /**
             * Gets the value of the guid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGuid() {
                return guid;
            }

            /**
             * Sets the value of the guid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGuid(String value) {
                this.guid = value;
            }

            /**
             * Gets the value of the trust property.
             * 
             * @return
             *     possible object is
             *     {@link UploadResponse.Return.Appendix.Trust }
             *     
             */
            public UploadResponse.Return.Appendix.Trust getTrust() {
                return trust;
            }

            /**
             * Sets the value of the trust property.
             * 
             * @param value
             *     allowed object is
             *     {@link UploadResponse.Return.Appendix.Trust }
             *     
             */
            public void setTrust(UploadResponse.Return.Appendix.Trust value) {
                this.trust = value;
            }

            /**
             * Gets the value of the info property.
             * 
             * @return
             *     possible object is
             *     {@link UploadResponse.Return.Appendix.Info }
             *     
             */
            public UploadResponse.Return.Appendix.Info getInfo() {
                return info;
            }

            /**
             * Sets the value of the info property.
             * 
             * @param value
             *     allowed object is
             *     {@link UploadResponse.Return.Appendix.Info }
             *     
             */
            public void setInfo(UploadResponse.Return.Appendix.Info value) {
                this.info = value;
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
             *       &lt;sequence>
             *         &lt;element name="sleipnirUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
             *         &lt;element name="odinUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
             *         &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
             *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="adminName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="barcodeUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
             *         &lt;element name="subjects">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="policies">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="zip">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="reject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="store" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="extract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="xml">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="reject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *                             &lt;element name="all" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *                             &lt;element name="namespace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="trust">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;all>
             *                             &lt;element name="reject" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             *                             &lt;element name="accept" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             *                           &lt;/all>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
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
                "sleipnirUri",
                "odinUri",
                "name",
                "website",
                "email",
                "phone",
                "adminName",
                "barcodeUri",
                "subjects",
                "policies"
            })
            public static class Info {

                @XmlElement(required = true)
                @XmlSchemaType(name = "anyURI")
                protected String sleipnirUri;
                @XmlElement(required = true)
                @XmlSchemaType(name = "anyURI")
                protected String odinUri;
                @XmlElement(required = true)
                @XmlSchemaType(name = "anyURI")
                protected String name;
                @XmlElement(required = true)
                @XmlSchemaType(name = "anyURI")
                protected String website;
                @XmlElement(required = true)
                protected String email;
                @XmlElement(required = true)
                protected String phone;
                @XmlElement(required = true)
                protected String adminName;
                @XmlElement(required = true)
                @XmlSchemaType(name = "anyURI")
                protected String barcodeUri;
                @XmlElement(required = true)
                protected UploadResponse.Return.Appendix.Info.Subjects subjects;
                @XmlElement(required = true)
                protected UploadResponse.Return.Appendix.Info.Policies policies;

                /**
                 * Gets the value of the sleipnirUri property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSleipnirUri() {
                    return sleipnirUri;
                }

                /**
                 * Sets the value of the sleipnirUri property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSleipnirUri(String value) {
                    this.sleipnirUri = value;
                }

                /**
                 * Gets the value of the odinUri property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOdinUri() {
                    return odinUri;
                }

                /**
                 * Sets the value of the odinUri property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOdinUri(String value) {
                    this.odinUri = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the website property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWebsite() {
                    return website;
                }

                /**
                 * Sets the value of the website property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWebsite(String value) {
                    this.website = value;
                }

                /**
                 * Gets the value of the email property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEmail() {
                    return email;
                }

                /**
                 * Sets the value of the email property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEmail(String value) {
                    this.email = value;
                }

                /**
                 * Gets the value of the phone property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPhone() {
                    return phone;
                }

                /**
                 * Sets the value of the phone property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPhone(String value) {
                    this.phone = value;
                }

                /**
                 * Gets the value of the adminName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAdminName() {
                    return adminName;
                }

                /**
                 * Sets the value of the adminName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAdminName(String value) {
                    this.adminName = value;
                }

                /**
                 * Gets the value of the barcodeUri property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBarcodeUri() {
                    return barcodeUri;
                }

                /**
                 * Sets the value of the barcodeUri property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBarcodeUri(String value) {
                    this.barcodeUri = value;
                }

                /**
                 * Gets the value of the subjects property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link UploadResponse.Return.Appendix.Info.Subjects }
                 *     
                 */
                public UploadResponse.Return.Appendix.Info.Subjects getSubjects() {
                    return subjects;
                }

                /**
                 * Sets the value of the subjects property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UploadResponse.Return.Appendix.Info.Subjects }
                 *     
                 */
                public void setSubjects(UploadResponse.Return.Appendix.Info.Subjects value) {
                    this.subjects = value;
                }

                /**
                 * Gets the value of the policies property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link UploadResponse.Return.Appendix.Info.Policies }
                 *     
                 */
                public UploadResponse.Return.Appendix.Info.Policies getPolicies() {
                    return policies;
                }

                /**
                 * Sets the value of the policies property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UploadResponse.Return.Appendix.Info.Policies }
                 *     
                 */
                public void setPolicies(UploadResponse.Return.Appendix.Info.Policies value) {
                    this.policies = value;
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
                 *         &lt;element name="zip">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="reject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="store" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="extract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="xml">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="reject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
                 *                   &lt;element name="all" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
                 *                   &lt;element name="namespace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="trust">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;all>
                 *                   &lt;element name="reject" type="{http://www.w3.org/2001/XMLSchema}integer"/>
                 *                   &lt;element name="accept" type="{http://www.w3.org/2001/XMLSchema}integer"/>
                 *                 &lt;/all>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
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
                public static class Policies {

                    @XmlElement(required = true)
                    protected UploadResponse.Return.Appendix.Info.Policies.Zip zip;
                    @XmlElement(required = true)
                    protected UploadResponse.Return.Appendix.Info.Policies.Xml xml;
                    @XmlElement(required = true)
                    protected UploadResponse.Return.Appendix.Info.Policies.Trust trust;

                    /**
                     * Gets the value of the zip property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link UploadResponse.Return.Appendix.Info.Policies.Zip }
                     *     
                     */
                    public UploadResponse.Return.Appendix.Info.Policies.Zip getZip() {
                        return zip;
                    }

                    /**
                     * Sets the value of the zip property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link UploadResponse.Return.Appendix.Info.Policies.Zip }
                     *     
                     */
                    public void setZip(UploadResponse.Return.Appendix.Info.Policies.Zip value) {
                        this.zip = value;
                    }

                    /**
                     * Gets the value of the xml property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link UploadResponse.Return.Appendix.Info.Policies.Xml }
                     *     
                     */
                    public UploadResponse.Return.Appendix.Info.Policies.Xml getXml() {
                        return xml;
                    }

                    /**
                     * Sets the value of the xml property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link UploadResponse.Return.Appendix.Info.Policies.Xml }
                     *     
                     */
                    public void setXml(UploadResponse.Return.Appendix.Info.Policies.Xml value) {
                        this.xml = value;
                    }

                    /**
                     * Gets the value of the trust property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link UploadResponse.Return.Appendix.Info.Policies.Trust }
                     *     
                     */
                    public UploadResponse.Return.Appendix.Info.Policies.Trust getTrust() {
                        return trust;
                    }

                    /**
                     * Sets the value of the trust property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link UploadResponse.Return.Appendix.Info.Policies.Trust }
                     *     
                     */
                    public void setTrust(UploadResponse.Return.Appendix.Info.Policies.Trust value) {
                        this.trust = value;
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
                     *         &lt;element name="reject" type="{http://www.w3.org/2001/XMLSchema}integer"/>
                     *         &lt;element name="accept" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
                    public static class Trust {

                        @XmlElement(required = true)
                        protected BigInteger reject;
                        @XmlElement(required = true)
                        protected BigInteger accept;

                        /**
                         * Gets the value of the reject property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getReject() {
                            return reject;
                        }

                        /**
                         * Sets the value of the reject property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setReject(BigInteger value) {
                            this.reject = value;
                        }

                        /**
                         * Gets the value of the accept property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getAccept() {
                            return accept;
                        }

                        /**
                         * Sets the value of the accept property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setAccept(BigInteger value) {
                            this.accept = value;
                        }

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
                     *       &lt;sequence>
                     *         &lt;element name="reject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
                     *         &lt;element name="all" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
                     *         &lt;element name="namespace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                        "reject",
                        "all",
                        "namespace"
                    })
                    public static class Xml {

                        protected Boolean reject;
                        protected Boolean all;
                        protected Boolean namespace;

                        /**
                         * Gets the value of the reject property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isReject() {
                            return reject;
                        }

                        /**
                         * Sets the value of the reject property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setReject(Boolean value) {
                            this.reject = value;
                        }

                        /**
                         * Gets the value of the all property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isAll() {
                            return all;
                        }

                        /**
                         * Sets the value of the all property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setAll(Boolean value) {
                            this.all = value;
                        }

                        /**
                         * Gets the value of the namespace property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isNamespace() {
                            return namespace;
                        }

                        /**
                         * Sets the value of the namespace property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setNamespace(Boolean value) {
                            this.namespace = value;
                        }

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
                     *       &lt;sequence>
                     *         &lt;element name="reject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="store" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="extract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                        "reject",
                        "store",
                        "extract"
                    })
                    public static class Zip {

                        protected boolean reject;
                        protected boolean store;
                        protected boolean extract;

                        /**
                         * Gets the value of the reject property.
                         * 
                         */
                        public boolean isReject() {
                            return reject;
                        }

                        /**
                         * Sets the value of the reject property.
                         * 
                         */
                        public void setReject(boolean value) {
                            this.reject = value;
                        }

                        /**
                         * Gets the value of the store property.
                         * 
                         */
                        public boolean isStore() {
                            return store;
                        }

                        /**
                         * Sets the value of the store property.
                         * 
                         */
                        public void setStore(boolean value) {
                            this.store = value;
                        }

                        /**
                         * Gets the value of the extract property.
                         * 
                         */
                        public boolean isExtract() {
                            return extract;
                        }

                        /**
                         * Sets the value of the extract property.
                         * 
                         */
                        public void setExtract(boolean value) {
                            this.extract = value;
                        }

                    }

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
                 *       &lt;sequence>
                 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
                    "subject"
                })
                public static class Subjects {

                    @XmlElement(required = true)
                    protected List<String> subject;

                    /**
                     * Gets the value of the subject property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the subject property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSubject().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getSubject() {
                        if (subject == null) {
                            subject = new ArrayList<String>();
                        }
                        return this.subject;
                    }

                }

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
             *       &lt;sequence>
             *         &lt;element name="trust" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="alternatives" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
             *                 &lt;/sequence>
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
                "trust",
                "alternatives"
            })
            public static class Trust {

                protected BigInteger trust;
                protected UploadResponse.Return.Appendix.Trust.Alternatives alternatives;

                /**
                 * Gets the value of the trust property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTrust() {
                    return trust;
                }

                /**
                 * Sets the value of the trust property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTrust(BigInteger value) {
                    this.trust = value;
                }

                /**
                 * Gets the value of the alternatives property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link UploadResponse.Return.Appendix.Trust.Alternatives }
                 *     
                 */
                public UploadResponse.Return.Appendix.Trust.Alternatives getAlternatives() {
                    return alternatives;
                }

                /**
                 * Sets the value of the alternatives property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UploadResponse.Return.Appendix.Trust.Alternatives }
                 *     
                 */
                public void setAlternatives(UploadResponse.Return.Appendix.Trust.Alternatives value) {
                    this.alternatives = value;
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
                 *       &lt;sequence>
                 *         &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
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
                    "server"
                })
                public static class Alternatives {

                    @XmlElement(required = true)
                    @XmlSchemaType(name = "anyURI")
                    protected List<String> server;

                    /**
                     * Gets the value of the server property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the server property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getServer().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getServer() {
                        if (server == null) {
                            server = new ArrayList<String>();
                        }
                        return this.server;
                    }

                }

            }

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
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        public static class Status {

            @XmlElement(required = true)
            protected BigInteger code;
            @XmlElement(required = true)
            protected String message;
            @XmlElement(required = true)
            protected String description;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCode(BigInteger value) {
                this.code = value;
            }

            /**
             * Gets the value of the message property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMessage() {
                return message;
            }

            /**
             * Sets the value of the message property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMessage(String value) {
                this.message = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

        }

    }

}
