package com.lw2.tp6.controller;

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

import com.lw2.tp6.model.Stb;
import com.lw2.tp6.persistence.HibernateUtil;

@RestController
public class PostController {

	
	
	@RequestMapping(value="depot/", method=RequestMethod.POST)
	@ResponseBody
	public Stb add(@RequestBody Stb stb,BindingResult result, SessionStatus status) {
		Session session = HibernateUtil.currentSession();
		session.beginTransaction();
		session.save(stb);
		session.getTransaction().commit();
		return stb;
	}
}
