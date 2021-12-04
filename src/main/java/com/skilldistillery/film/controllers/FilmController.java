package com.skilldistillery.film.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.film.data.FilmDAO;
import com.skilldistillery.film.entities.Film;

@Controller
public class FilmController {

	@Autowired
	private FilmDAO filmDao;

	@RequestMapping({ "/", "home.do" })
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("home");

		return mv;

	}

	@RequestMapping(path = "IdSearch.do", params = "filmId", method = RequestMethod.GET)
	public ModelAndView getByFilmID(String filmId) {
		int id = Integer.parseInt(filmId);

		ModelAndView mv = new ModelAndView();
		Film film = filmDao.findFilmById(id);

		mv.addObject("film", film);
		mv.setViewName("result");

		return mv;
	}

	@RequestMapping(path = "AddFilm.do", method = RequestMethod.POST)
	public ModelAndView addFilm(String title, int languageId, int rentalPeriod, double rentalRate,
			double replacementCost) {
		ModelAndView mv = new ModelAndView();
		Film film = filmDao.addFilm(new Film(title, languageId, rentalPeriod, rentalRate, replacementCost));

		mv.addObject("film", film);
		mv.setViewName("result");

		return mv;
	}

}
