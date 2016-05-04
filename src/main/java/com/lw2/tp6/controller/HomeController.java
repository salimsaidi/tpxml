package com.lw2.tp6.controller;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;

import com.lw2.tp6.model.AdrType;
import com.lw2.tp6.model.Client;
import com.lw2.tp6.model.Contact;
import com.lw2.tp6.model.Equipe;
import com.lw2.tp6.model.Exigence;
import com.lw2.tp6.model.Fonctionnalite;
import com.lw2.tp6.model.GenderType;
import com.lw2.tp6.model.Stb;
import com.lw2.tp6.persistence.HibernateUtil;



@Controller
public class HomeController {

	public String getXmlFromObject(Stb stb){
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Stb.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			java.io.StringWriter sw = new StringWriter();
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			jaxbMarshaller.marshal(stb, sw);
			return sw.toString();

		}catch (JAXBException e) {
			return e.toString();
		}

	}

	public static void main(String[] args) throws DatatypeConfigurationException {
		
		Session session = HibernateUtil.currentSession();
		System.out.println("Donehjgkjkkgjhgk");
		session.beginTransaction();
		
		AdrType addr = new AdrType("c207 madrillet","Rouen",76800,"France");
		Contact contact = new Contact("qette", "omar", addr);
		Client client = new Client("test", contact);
		GenderType genderType = new GenderType("Salim", true);
		Equipe equipe = new Equipe(genderType,"Saidi");
		List<Equipe> equipes = new ArrayList<>();
		equipes.add(equipe);
		List<Exigence> exigences = new ArrayList<>();
		Exigence exigence = new Exigence("trrrr",5,"omar");
		exigences.add(exigence);
		Fonctionnalite fonctionnalite = new Fonctionnalite(0, "hiuhiuh iuhiuh",exigences);
		List<Fonctionnalite> fonctionnalites = new ArrayList<>();
		fonctionnalites.add(fonctionnalite);
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
		XMLGregorianCalendar now = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
		Stb stb = new Stb("stbTest","version 1", now , "desdeded",client,equipes,fonctionnalites,null);
		session.save(stb);
		System.out.println("Done33333");
		session.getTransaction().commit();
		System.out.println("Done");
		try {

			File file = new File("E:\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Stb.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(stb, file);
			jaxbMarshaller.marshal(stb, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
	
	
	
}
