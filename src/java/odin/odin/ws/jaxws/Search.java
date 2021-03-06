
package odin.odin.ws.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="search">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="ipaddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="document">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="guid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="author">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="locale">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}language"/>
 *                                       &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="attributes">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="attribute" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                             &lt;element name="keywords">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="added" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="at" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="by" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "search", propOrder = {
    "arg0"
})
public class Search {

    protected Search.Arg0 arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link Search.Arg0 }
     *     
     */
    public Search.Arg0 getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Search.Arg0 }
     *     
     */
    public void setArg0(Search.Arg0 value) {
        this.arg0 = value;
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
     *         &lt;element name="ipaddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="document">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="guid" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="author">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="locale">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}language"/>
     *                             &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="attributes">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="attribute" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                   &lt;element name="keywords">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="added" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="at" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="by" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class Arg0 {

        @XmlElement(required = true)
        protected String ipaddress;
        @XmlElement(required = true)
        protected String username;
        @XmlElement(required = true)
        protected Search.Arg0 .Document document;

        /**
         * Gets the value of the ipaddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIpaddress() {
            return ipaddress;
        }

        /**
         * Sets the value of the ipaddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIpaddress(String value) {
            this.ipaddress = value;
        }

        /**
         * Gets the value of the username property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * Sets the value of the username property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * Gets the value of the document property.
         * 
         * @return
         *     possible object is
         *     {@link Search.Arg0 .Document }
         *     
         */
        public Search.Arg0 .Document getDocument() {
            return document;
        }

        /**
         * Sets the value of the document property.
         * 
         * @param value
         *     allowed object is
         *     {@link Search.Arg0 .Document }
         *     
         */
        public void setDocument(Search.Arg0 .Document value) {
            this.document = value;
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
         *         &lt;element name="guid" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="author">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="locale">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}language"/>
         *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="attributes">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="attribute" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
         *         &lt;element name="keywords">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="added" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="at" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="by" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "guid",
            "title",
            "author",
            "locale",
            "attributes",
            "keywords",
            "added"
        })
        public static class Document {

            @XmlElement(required = true)
            protected String guid;
            @XmlElement(required = true)
            protected String title;
            @XmlElement(required = true)
            protected Search.Arg0 .Document.Author author;
            @XmlElement(required = true)
            protected Search.Arg0 .Document.Locale locale;
            @XmlElement(required = true)
            protected Search.Arg0 .Document.Attributes attributes;
            @XmlElement(required = true)
            protected Search.Arg0 .Document.Keywords keywords;
            protected Search.Arg0 .Document.Added added;

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
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Gets the value of the author property.
             * 
             * @return
             *     possible object is
             *     {@link Search.Arg0 .Document.Author }
             *     
             */
            public Search.Arg0 .Document.Author getAuthor() {
                return author;
            }

            /**
             * Sets the value of the author property.
             * 
             * @param value
             *     allowed object is
             *     {@link Search.Arg0 .Document.Author }
             *     
             */
            public void setAuthor(Search.Arg0 .Document.Author value) {
                this.author = value;
            }

            /**
             * Gets the value of the locale property.
             * 
             * @return
             *     possible object is
             *     {@link Search.Arg0 .Document.Locale }
             *     
             */
            public Search.Arg0 .Document.Locale getLocale() {
                return locale;
            }

            /**
             * Sets the value of the locale property.
             * 
             * @param value
             *     allowed object is
             *     {@link Search.Arg0 .Document.Locale }
             *     
             */
            public void setLocale(Search.Arg0 .Document.Locale value) {
                this.locale = value;
            }

            /**
             * Gets the value of the attributes property.
             * 
             * @return
             *     possible object is
             *     {@link Search.Arg0 .Document.Attributes }
             *     
             */
            public Search.Arg0 .Document.Attributes getAttributes() {
                return attributes;
            }

            /**
             * Sets the value of the attributes property.
             * 
             * @param value
             *     allowed object is
             *     {@link Search.Arg0 .Document.Attributes }
             *     
             */
            public void setAttributes(Search.Arg0 .Document.Attributes value) {
                this.attributes = value;
            }

            /**
             * Gets the value of the keywords property.
             * 
             * @return
             *     possible object is
             *     {@link Search.Arg0 .Document.Keywords }
             *     
             */
            public Search.Arg0 .Document.Keywords getKeywords() {
                return keywords;
            }

            /**
             * Sets the value of the keywords property.
             * 
             * @param value
             *     allowed object is
             *     {@link Search.Arg0 .Document.Keywords }
             *     
             */
            public void setKeywords(Search.Arg0 .Document.Keywords value) {
                this.keywords = value;
            }

            /**
             * Gets the value of the added property.
             * 
             * @return
             *     possible object is
             *     {@link Search.Arg0 .Document.Added }
             *     
             */
            public Search.Arg0 .Document.Added getAdded() {
                return added;
            }

            /**
             * Sets the value of the added property.
             * 
             * @param value
             *     allowed object is
             *     {@link Search.Arg0 .Document.Added }
             *     
             */
            public void setAdded(Search.Arg0 .Document.Added value) {
                this.added = value;
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
             *         &lt;element name="at" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="by" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            public static class Added {

                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar at;
                protected String by;
                protected String from;

                /**
                 * Gets the value of the at property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getAt() {
                    return at;
                }

                /**
                 * Sets the value of the at property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setAt(XMLGregorianCalendar value) {
                    this.at = value;
                }

                /**
                 * Gets the value of the by property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBy() {
                    return by;
                }

                /**
                 * Sets the value of the by property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBy(String value) {
                    this.by = value;
                }

                /**
                 * Gets the value of the from property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrom() {
                    return from;
                }

                /**
                 * Sets the value of the from property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrom(String value) {
                    this.from = value;
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
             *         &lt;element name="attribute" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "attribute"
            })
            public static class Attributes {

                @XmlElement(nillable = true)
                protected List<Search.Arg0 .Document.Attributes.Attribute> attribute;

                /**
                 * Gets the value of the attribute property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the attribute property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAttribute().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Search.Arg0 .Document.Attributes.Attribute }
                 * 
                 * 
                 */
                public List<Search.Arg0 .Document.Attributes.Attribute> getAttribute() {
                    if (attribute == null) {
                        attribute = new ArrayList<Search.Arg0 .Document.Attributes.Attribute>();
                    }
                    return this.attribute;
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
                 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                public static class Attribute {

                    @XmlElement(required = true)
                    protected String key;
                    @XmlElement(required = true)
                    protected String value;

                    /**
                     * Gets the value of the key property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getKey() {
                        return key;
                    }

                    /**
                     * Sets the value of the key property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setKey(String value) {
                        this.key = value;
                    }

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
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
             *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
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
            public static class Author {

                @XmlElement(required = true)
                protected String firstName;
                @XmlElement(required = true)
                protected String surname;
                @XmlElement(required = true)
                protected String prefix;
                @XmlElement(required = true)
                protected String company;
                @XmlElement(required = true)
                protected String email;
                @XmlElement(required = true)
                @XmlSchemaType(name = "anyURI")
                protected String website;

                /**
                 * Gets the value of the firstName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFirstName() {
                    return firstName;
                }

                /**
                 * Sets the value of the firstName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFirstName(String value) {
                    this.firstName = value;
                }

                /**
                 * Gets the value of the surname property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSurname() {
                    return surname;
                }

                /**
                 * Sets the value of the surname property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSurname(String value) {
                    this.surname = value;
                }

                /**
                 * Gets the value of the prefix property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPrefix() {
                    return prefix;
                }

                /**
                 * Sets the value of the prefix property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPrefix(String value) {
                    this.prefix = value;
                }

                /**
                 * Gets the value of the company property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCompany() {
                    return company;
                }

                /**
                 * Sets the value of the company property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCompany(String value) {
                    this.company = value;
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
             *         &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                "keyword"
            })
            public static class Keywords {

                @XmlElement(nillable = true)
                protected List<String> keyword;

                /**
                 * Gets the value of the keyword property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the keyword property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getKeyword().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getKeyword() {
                    if (keyword == null) {
                        keyword = new ArrayList<String>();
                    }
                    return this.keyword;
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
             *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}language"/>
             *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            public static class Locale {

                @XmlElement(required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "language")
                protected String language;
                @XmlElement(required = true)
                protected String country;

                /**
                 * Gets the value of the language property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLanguage() {
                    return language;
                }

                /**
                 * Sets the value of the language property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLanguage(String value) {
                    this.language = value;
                }

                /**
                 * Gets the value of the country property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountry() {
                    return country;
                }

                /**
                 * Sets the value of the country property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountry(String value) {
                    this.country = value;
                }

            }

        }

    }

}
