package com.lw2.tp6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;

import com.lw2.tp6.model.Stb;

@Controller
public class PostController {

	@RequestMapping(value="add/", method=RequestMethod.POST)
	@ResponseBody
	public Stb resumeId(@RequestBody Stb stb,BindingResult result, SessionStatus status) {
		return stb;
	}
}
