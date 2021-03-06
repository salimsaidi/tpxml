//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.28 at 03:58:12 PM CEST 
//


package com.lw2.tp6.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


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
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adress" type="{http://univ.fr/stb}adrType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Entity
@Table(name="contact")
@XmlAccessorType(XmlAccessType.NONE)

@XmlRootElement(name = "contact")
public class Contact {

	@XmlElement(required = true)
	protected String nom;
	@XmlElement(required = true)
	protected String prenom;
	@XmlElement(required = true)
	protected AdrType adress;
	@XmlTransient
	protected Long contactId ;
	
	
	
	public Contact(String nom, String prenom, AdrType adress) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CONTACT_ID", unique = true, nullable = false)
	public Long getContactId() {
		return contactId;
	}



	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}



	public void setStbId(Long contactId) {
		this.contactId = contactId;
	}




	/**
	 * Gets the value of the nom property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	@Column(name="NOM")
	public String getNom() {
		return nom;
	}

	/**
	 * Sets the value of the nom property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setNom(String value) {
		this.nom = value;
	}

	/**
	 * Gets the value of the prenom property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	@Column(name="PRENOM")
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Sets the value of the prenom property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setPrenom(String value) {
		this.prenom = value;
	}

	/**
	 * Gets the value of the adress property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link AdrType }
	 *     
	 */
	@OneToOne(cascade = CascadeType.ALL)
	public AdrType getAdress() {
		return adress;
	}

	public Contact() {
		super();
	}

	/**
	 * Sets the value of the adress property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link AdrType }
	 *     
	 */
	public void setAdress(AdrType value) {
		this.adress = value;
	}

}
