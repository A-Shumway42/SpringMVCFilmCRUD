package com.skilldistillery.film.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skilldistillery.film.data.FilmDAO;
import com.skilldistillery.film.entities.Film;

@Controller
public class FilmDeleteController {

	@Autowired
	private FilmDAO filmDao;

	@RequestMapping(path = { "/", "delete.do" })
	public String delete() {
		return "WEB-INF/delete.jsp";
	}

	@RequestMapping(path = "deleteFilmDetails.do", method = RequestMethod.POST)
	public ModelAndView deleteFilmData(Film film, RedirectAttributes redir) {
		boolean isDeleted = filmDao.deleteFilm(film);
		ModelAndView mv = new ModelAndView();
		redir.addFlashAttribute("isFilmDeleted", isDeleted);
		boolean deletedConfirm = true;
		redir.addFlashAttribute("deletedConfirm", deletedConfirm);
		mv.setViewName("WEB-INF/result.jsp");
		return mv;
	}

	@RequestMapping(path = "filmDeleted.do", method = RequestMethod.GET)
	public ModelAndView filmDeleted() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("WEB-INF/result.jsp");
		return mv;

	}

}
