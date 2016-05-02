//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.28 at 03:58:12 PM CEST 
//


package com.lw2.tp6.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="priorite" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exigence" maxOccurs="unbounded" minOccurs="2">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{http://univ.fr/stb}priorite"/>
 *                 &lt;/all>
 *                 &lt;attribute name="identifiant" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@Entity
@Table(name="fonctionnalite")
@XmlAccessorType(XmlAccessType.NONE)

@XmlRootElement(name = "fonctionnalite")
public class Fonctionnalite {

	protected int priorite;
	@XmlElement(required = true)
	protected String description;
	@XmlElement(required = true)
	
	private long fonctionnaliteId ;
	private Stb stb;


	public Fonctionnalite() {
		super();
	}

	public Fonctionnalite(int priorite, String description) {
		super();
		this.priorite = priorite;
		this.description = description;

	}

	@Id  
	@GeneratedValue(strategy = IDENTITY)
	@Column(name="FONCTIONNALITE_ID", unique = true, nullable = false)
	public long getFonctionnaliteId() {
		return fonctionnaliteId;
	}

	public void setFonctionnaliteId(long fonctionnaliteId) {
		this.fonctionnaliteId = fonctionnaliteId;
	}

	@ManyToOne(cascade=CascadeType.ALL)  
	public Stb getStb() {
		return stb;
	}

	public void setStb(Stb stb) {
		this.stb = stb;
	}

	/**
	 * Gets the value of the priorite property.
	 * 
	 */
	@Column(name="PRIORITE")
	public int getPriorite() {
		return priorite;
	}

	/**
	 * Sets the value of the priorite property.
	 * 
	 */
	public void setPriorite(int value) {
		this.priorite = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	@Column(name="DESCRIPTION")
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

	/**
	 * Gets the value of the exigence property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the exigence property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getExigence().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Fonctionnalite.Exigence }
	 * 
	 * 
	 */




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
	 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element ref="{http://univ.fr/stb}priorite"/>
	 *       &lt;/all>
	 *       &lt;attribute name="identifiant" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
}
