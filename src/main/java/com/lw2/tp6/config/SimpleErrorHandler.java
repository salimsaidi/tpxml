package com.lw2.tp6.config;



import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class SimpleErrorHandler implements org.xml.sax.ErrorHandler{

	private boolean errorOccured = false;
	
	
	public void warning(SAXParseException exception) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	public void error(SAXParseException exception) throws SAXException {
		
		this.errorOccured = true;
		
	}

	public void fatalError(SAXParseException exception) throws SAXException {
		// TODO Auto-generated method stub
		this.errorOccured = true;
	}
	
	public boolean hasError(){
		return this.errorOccured;
	}

}
