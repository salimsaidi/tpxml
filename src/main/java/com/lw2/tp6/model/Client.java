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
 *         &lt;element name="entite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://univ.fr/stb}contact"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Entity
@Table(name="client")
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "client")
public class Client {

	@XmlElement(required = true)
	protected String entite;
	@XmlElement(namespace = "http://univ.fr/stb", required = true)
	protected Contact contact;
	@XmlTransient
	protected Long clientId ;
 




	public Client(String entite, Contact contact) {
		super();
		this.entite = entite;
		this.contact = contact;
	}

	public Client() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CLIENT_ID",  unique = true, nullable = false)
	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}



	/**
	 * Gets the value of the entite property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	@Column(name="ENTITE")
	public String getEntite() {
		return entite;
	}

	
	/**
	 * Sets the value of the entite property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setEntite(String value) {
		this.entite = value;
	}

	/**
	 * Gets the value of the contact property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Contact }
	 *     
	 */
	@OneToOne( cascade = CascadeType.ALL)
	public Contact getContact() {
		return contact;
	}

	/**
	 * Sets the value of the contact property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Contact }
	 *     
	 */
	public void setContact(Contact value) {
		this.contact = value;
	}

}
