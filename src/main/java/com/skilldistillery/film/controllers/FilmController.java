package com.skilldistillery.film.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skilldistillery.film.data.FilmDAO;
import com.skilldistillery.film.entities.Film;

@Controller
public class FilmController {

	@Autowired
	FilmDAO filmDao;

	@RequestMapping({ "/", "home.do" })
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("home");

		return mv;

	}
	

	@RequestMapping(path = "IdSearch.do", params = "filmId", method = RequestMethod.GET)
	public ModelAndView getByFilmID(String filmId, HttpSession session) {
		int id = Integer.parseInt(filmId);

		ModelAndView mv = new ModelAndView();
		Film film = filmDao.findFilmById(id);


		mv.addObject("film", film);
		mv.setViewName("result");

		session.setAttribute("film", film);
		return mv;
	}

	@RequestMapping(path = "AddFilm.do", method = RequestMethod.POST)
	public ModelAndView addFilm(String title, Integer languageId, Integer rentalPeriod, Double rentalRate,
			Double replacementCost, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		Film film = filmDao.addFilm(new Film(title, languageId, rentalPeriod, rentalRate, replacementCost));

		mv.addObject("film", film);
		mv.setViewName("result");
		session.setAttribute("film", film);
		return mv;
	}


	@RequestMapping(path = "deleteFilm.do", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView deleteFilm(RedirectAttributes redir, HttpSession session) {
		Film current = getCurrentFilmFromSession(session);
		boolean isDeleted = filmDao.deleteFilm(current);
		ModelAndView mv = new ModelAndView();
		redir.addFlashAttribute("isFilmDeleted", isDeleted);
		boolean deletedConfirm = true;
		redir.addFlashAttribute("deletedConfirm", deletedConfirm);
		mv.setViewName("redirect:filmDeleted.do");

		return mv;
	}

	@RequestMapping(path = "filmDeleted.do", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView filmDeleted() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("delete");

		return mv;

	}

	private Film getCurrentFilmFromSession(HttpSession session) {
		Film current = (Film) session.getAttribute("film");

		return current;
	}



}
