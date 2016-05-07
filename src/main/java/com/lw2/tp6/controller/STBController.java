package com.lw2.tp6.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lw2.tp6.model.Membres;
import com.lw2.tp6.model.Resume;
import com.lw2.tp6.model.ResumeList;
import com.lw2.tp6.model.Stb;
import com.lw2.tp6.model.StbList;
import com.lw2.tp6.persistence.HibernateUtil;
@Controller
public class STBController {
	
	
	@RequestMapping(value ="/", method = RequestMethod.GET)
	@ResponseBody
	public Membres acceuil() {
		Session session = HibernateUtil.currentSession();
		Criteria criteria = session.createCriteria(Stb.class);
		StbList stbList = new StbList();	
		stbList.setStbs((ArrayList<Stb>) criteria.list());
		Membres m = new Membres("QETTE Omar (TP4)", "SAIDI Mohamed Salim (TP5)",stbList.getStbs().size() );
		return m;
	}
	
	@RequestMapping("resume/{id}")
	@ResponseBody
	public Stb resumeId(@PathVariable("id") int id) {
		Stb stb = null;
		try {
			Session session = HibernateUtil.currentSession();
            stb =  (Stb) session.get(Stb.class, id);
        } catch (Exception e) {
        	 e.printStackTrace();
        }
		return stb;
	}
	
	
	@RequestMapping(value ="/resume", method = RequestMethod.GET)
	@ResponseBody
	public ResumeList resume() {
		Session session = HibernateUtil.currentSession();
		Criteria criteria = session.createCriteria(Stb.class);
		StbList stbList = new StbList();
		stbList.setStbs((ArrayList<Stb>) criteria.list());
		ResumeList resumeList = new ResumeList();
		for (Stb stb : stbList.getStbs()) {
			resumeList.add(new Resume( stb.getStbId(),stb.getTitre(), stb.getVersion(), stb.getDate() , stb.getDescription()));
		}
		
	    resumeList.setNbStb(stbList.getStbs().size());
	    
		return resumeList;
	}

	
	
	
	
	


}
