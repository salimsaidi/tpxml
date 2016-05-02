package com.lw2.tp6.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lw2.tp6.model.Stb;
import com.lw2.tp6.model.StbList;
@Controller
public class STBController {
	
	@RequestMapping("resume/{id}")
	@ResponseBody
	public Stb resumeId(@PathVariable("id") int id) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

		Stb stb = new Stb();
		return stb;
	}
	
	
	@RequestMapping("/resume")
	@ResponseBody
	public StbList resume() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		StbList stbList = new StbList();
		for(int i =0;i<4;i++){
			stbList.add(new Stb());
		}
		return stbList;
	}

	
	
	
	
	


}
