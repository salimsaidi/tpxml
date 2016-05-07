package com.lw2.tp6.controller;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.SessionStatus;

import com.lw2.tp6.config.validateXML;
import com.lw2.tp6.model.Stb;
import com.lw2.tp6.persistence.HibernateUtil;


@RestController
public class PostController {

	
	
	@RequestMapping(value="depot/", method=RequestMethod.POST)
	@ResponseBody
	public Stb add(@RequestBody Stb stb,BindingResult result, SessionStatus status) throws JAXBException, IOException, URISyntaxException {
		/*
		 * valider la stb
		 */
		JAXBContext jaxbContext = JAXBContext.newInstance(Stb.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		ClassLoader classLoader = getClass().getClassLoader();
		File resourceFile = new File(classLoader.getResource("tmp.xml").getFile());
		jaxbMarshaller.marshal(stb, resourceFile);
		resourceFile.createNewFile();
		
		jaxbMarshaller.marshal(stb, System.out);
		validateXML validateXML = new validateXML("tmp.xml");
		if(validateXML.isValid()){ 
			Session session = HibernateUtil.currentSession();
			session.beginTransaction();
			session.save(stb);
			session.getTransaction().commit();
			return stb;
		}
		return null;
	}
	
	@RequestMapping(value="depotstb/", method=RequestMethod.POST)
	@ResponseBody
	public String addstb(@RequestBody Stb stb,BindingResult result, SessionStatus status) throws JAXBException, IOException, URISyntaxException {
		/*
		 * valider la stb
		 */
		JAXBContext jaxbContext = JAXBContext.newInstance(Stb.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		ClassLoader classLoader = getClass().getClassLoader();
		File resourceFile = new File(classLoader.getResource("tmp.xml").getFile());
		jaxbMarshaller.marshal(stb, resourceFile);
		resourceFile.createNewFile();
		jaxbMarshaller.marshal(stb, System.out);
		validateXML validateXML = new validateXML("tmp.xml");
		if(validateXML.isValid()){
			Session session = HibernateUtil.currentSession();
			session.beginTransaction();
			session.save(stb);
			session.getTransaction().commit();
			return "true";
		}
		return "stb non valide";
	}



}
