package com.skilldistillery.film.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class FilmController {
	
	public String home() {
		return "home";
	}

}