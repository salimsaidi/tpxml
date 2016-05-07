package com.lw2.tp6.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "membres")
public class Membres {

	@XmlElement(required = true)
	@XmlSchemaType(name = "membre1")
	private String m1;
	@XmlElement(required = true)
	@XmlSchemaType(name = "membre2")
	private String m2;
	@XmlElement(required = true)
	@XmlSchemaType(name = "NombreStb")
	private Integer nbstb;
	
	
	public Membres() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Membres(String m1, String m2, Integer nbstb) {
		super();
		this.m1 = m1;
		this.m2 = m2;
		this.nbstb = nbstb;
	}
	public String getM1() {
		return m1;
	}
	public void setM1(String m1) {
		this.m1 = m1;
	}
	public String getM2() {
		return m2;
	}
	public void setM2(String m2) {
		this.m2 = m2;
	}
	public Integer getNbstb() {
		return nbstb;
	}
	public void setNbstb(Integer nbstb) {
		this.nbstb = nbstb;
	}
	
	
}

