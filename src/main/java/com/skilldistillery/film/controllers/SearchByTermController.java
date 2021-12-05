package com.skilldistillery.film.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.film.data.FilmDAO;
import com.skilldistillery.film.entities.Film;

public class SearchByTermController {

	@Autowired
	private FilmDAO filmDao;


	@RequestMapping(path = "KeywordSearch.do", method = RequestMethod.GET)
	public ModelAndView getByFilmID(String filmId, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		Film film = filmDao.findFilmById(filmId);
		
		session.setAttribute("film", film);

		mv.addObject("film", film);
		mv.setViewName("result");

		return mv;
	}

	

}
