package com.lw2.tp6.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="stb")
@XmlType(propOrder={"titre","version","date","description"})
public class Stb {
	
	private String titre;
	private String version;
	private String date;
	private String description;
	
	public Stb(){
		
	}
	
	
	
	public Stb(String titre, String version, String date, String description) {
		super();
		this.titre = titre;
		this.version = version;
		this.date = date;
		this.description = description;
	}



	public  String getTitre() {
		return titre;
	}
	@XmlElement(required = true,name = "titre")
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getVersion() {
		return version;
	}
	@XmlElement(required = true,name = "version")
	public void setVersion(String version) {
		this.version = version;
	}
	public String getDate() {
		return date;
	}
	
	@XmlElement(required = true,name = "date")
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	
	@XmlElement(required = true,name = "description")
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
