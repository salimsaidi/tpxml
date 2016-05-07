package com.lw2.tp6.config;


import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public class validateXML {
	
	private String xml;
	
	
	
	public validateXML(String xml) {
		super();
		this.xml = xml;
	}



	public boolean isValid() throws URISyntaxException {
		
		ClassLoader classLoader = getClass().getClassLoader();
		File resourceFile = new File(classLoader.getResource(xml).getFile());
		
		Source xmlFile = new StreamSource(resourceFile);
		SchemaFactory schemaFactory = SchemaFactory
		    .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = null;
		try {
			ClassLoader classLoader2 = getClass().getClassLoader();
			File resourceFile2 = new File(classLoader2.getResource("t.xsd").getFile());
			schema = schemaFactory.newSchema(resourceFile2);
			Validator validator = schema.newValidator();
			validator.validate(xmlFile);
		return true;
		} catch (SAXException | IOException e) {
			e.printStackTrace();
			return false;
		
		}
		
		
	}
	
}
