package com.skilldistillery.film.controllers;

<<<<<<< HEAD
import org.springframework.stereotype.Controller;

@Controller
public class FilmController {
	
	public String home() {
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.film.data.FilmDAO;

@Controller 
public class FilmController {
	
	
	@Autowired
	private FilmDAO filmDao;
	
	@RequestMapping({"/", "home.do"})
	public String home(Model model) {
		model.addAttribute("TEST", "Hello, Spring MVC!");
>>>>>>> 0ddc2839528d2f0384c24c55d60850ecfb8b5897
		return "home";
	}

}
