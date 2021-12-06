package com.skilldistillery.film.controllers;

import java.util.List;

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
	public ModelAndView home(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		
		if(session != null) {
			session.invalidate();
		}

		if(session != null) {
			session.invalidate();
		}
		
		mv.setViewName("home");

		return mv;
	}

	@RequestMapping(path = "IdSearch.do", method = RequestMethod.GET)
	public ModelAndView getByFilmID(Integer filmId, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		Film film = filmDao.findFilmById(filmId);

		session.setAttribute("film", film);

		if (film != null) {
			mv.addObject("actors", film.getActors());
		}
		mv.addObject("film", film);
		mv.setViewName("result");
		return mv;
	}

	@RequestMapping(path = "KeySearch.do", method = RequestMethod.GET)
	public ModelAndView getFilmKeyWord(String keyWord, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		List<Film> films = filmDao.keywordSearch(keyWord);

		for (Film film : films) {
			mv.addObject("actors", film.getActors());

		}

		mv.addObject("films", films);
		mv.setViewName("result");

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
		ModelAndView mv = new ModelAndView();
		Film current = getCurrentFilmFromSession(session);

		boolean isDeleted = filmDao.deleteFilm(current);
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

	@RequestMapping(path = "updateFilmForm.do", method = RequestMethod.GET)
	public ModelAndView updateFilmForm(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		Film current = getCurrentFilmFromSession(session);

		mv.addObject("film", current);
		mv.setViewName("filmUpdate");

		return mv;
	}

	@RequestMapping(path = "updateFilm.do", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView updateFilm(Film film, RedirectAttributes redir) {
		ModelAndView mv = new ModelAndView();

		filmDao.updateFilm(film);

		boolean isUpdated = film.getFilmId() > 0 ? true : false;
		redir.addFlashAttribute("isFilmUpdated", isUpdated);

		boolean updateConfirm = true;
		redir.addFlashAttribute("updateConfirm", updateConfirm);

		mv.setViewName("redirect:filmUpdated.do");

		return mv;

	}

	@RequestMapping(path = "filmUpdated.do", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView filmUpdated() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("delete");

		return mv;
	}

	private Film getCurrentFilmFromSession(HttpSession session) {
		Film current = (Film) session.getAttribute("film");

		return current;
	}

}
