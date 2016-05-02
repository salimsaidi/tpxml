//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.28 at 03:58:12 PM CEST 
//


package com.lw2.tp6.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.univ.stb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Version_QNAME = new QName("http://univ.fr/stb", "version");
    private final static QName _Commentaire_QNAME = new QName("http://univ.fr/stb", "commentaire");
    private final static QName _Description_QNAME = new QName("http://univ.fr/stb", "description");
    private final static QName _Priorite_QNAME = new QName("http://univ.fr/stb", "priorite");
    private final static QName _Titre_QNAME = new QName("http://univ.fr/stb", "titre");
    private final static QName _Date_QNAME = new QName("http://univ.fr/stb", "date");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.univ.stb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Fonctionnalite }
     * 
     */
    public Fonctionnalite createFonctionnalite() {
        return new Fonctionnalite();
    }

    /**
     * Create an instance of {@link Stb }
     * 
     */
    public Stb createStb() {
        return new Stb();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link AdrType }
     * 
     */
    public AdrType createAdrType() {
        return new AdrType();
    }

    /**
     * Create an instance of {@link Equipe }
     * 
     */
    public Equipe createEquipe() {
        return new Equipe();
    }

    /**
     * Create an instance of {@link GenderType }
     * 
     */
    public GenderType createGenderType() {
        return new GenderType();
    }

    /**
     * Create an instance of {@link Fonctionnalite.Exigence }
     * 
     */
   
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://univ.fr/stb", name = "version", defaultValue = "0.1")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(_Version_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://univ.fr/stb", name = "commentaire")
    public JAXBElement<String> createCommentaire(String value) {
        return new JAXBElement<String>(_Commentaire_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://univ.fr/stb", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://univ.fr/stb", name = "priorite")
    public JAXBElement<Integer> createPriorite(Integer value) {
        return new JAXBElement<Integer>(_Priorite_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://univ.fr/stb", name = "titre")
    public JAXBElement<String> createTitre(String value) {
        return new JAXBElement<String>(_Titre_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://univ.fr/stb", name = "date")
    public JAXBElement<XMLGregorianCalendar> createDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Date_QNAME, XMLGregorianCalendar.class, null, value);
    }

}