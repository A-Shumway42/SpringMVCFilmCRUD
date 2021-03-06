package com.skilldistillery.film.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Film {
	private List<Actor> actors;
	private int filmId;
	private String title;
	private String description;
	private int releaseYear;
	private int languageId;
	private String language;
	private int rentalPeriod;
	private double rentalRate;
	private int length;
	private double replacementCost;
	private String rating;
	private String specialFeatures;

	public Film() {

	}

	public Film(int filmId, String title, String description,
			int releaseYear, int languageId, int rentalPeriod,
			double rentalRate, int length, double replacementCost, String rating, String specialFeatures) {
		this.filmId = filmId;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.languageId = languageId;
		this.rentalPeriod = rentalPeriod;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rating = rating;
		this.specialFeatures = specialFeatures;
		actors = new ArrayList<>();
	}

	public Film(String title, int languageId, int rentalPeriod, double rentalRate, double replacementCost) {
		this.title = title;
		this.languageId = languageId;
		this.rentalPeriod = rentalPeriod;
		this.rentalRate = rentalRate;
		this.replacementCost = replacementCost;
		actors = new ArrayList<>();
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public int getRentalPeriod() {
		return rentalPeriod;
	}

	public void setRentalPeriod(int rentalPeriod) {
		this.rentalPeriod = rentalPeriod;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(double replacementCost) {
		this.replacementCost = replacementCost;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	public void simpleString() {
		System.out.println("========================================================");
		System.out.println("Title: " + getTitle() + "\n Release Year: " + getReleaseYear() + "\n Language: "
				+ getLanguage() + "\n Rating: " + getRating() + "\n Description: " + getDescription());
		System.out.println("_________     _____    ____________________\n"
				+ "\\_   ___ \\   /  _  \\  /   _____/\\__    ___/\n"
				+ "/    \\  \\/  /  /_\\  \\ \\_____  \\   |    |   \n"
				+ "\\     \\____/    |    \\/        \\  |    |   \n"
				+ " \\______  /\\____|__  /_______  /  |____|   \n" + "        \\/         \\/        \\/          ");
		if (actors != null) {
			for (Actor actor : actors) {
				actor.simpleString();
			}
			System.out.println("========================================================");
		}
	}

	@Override
	public String toString() {
		return "Film [actors: " + actors + ", filmId: " + filmId + ", title: " + title + ", description: " + description
				+ ", releaseYear: " + releaseYear + ", languageId: " + languageId + ", language: " + language
				+ ", rentalPeriod: " + rentalPeriod + ", rentalRate: " + rentalRate + ", length: " + length
				+ ", replacementCost: " + replacementCost + ", rating: " + rating + ", specialFeatures: "
				+ specialFeatures + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, filmId, languageId, length, rating, releaseYear, rentalPeriod, rentalRate,
				replacementCost, specialFeatures, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return Objects.equals(description, other.description) && filmId == other.filmId
				&& languageId == other.languageId && length == other.length && Objects.equals(rating, other.rating)
				&& Objects.equals(releaseYear, other.releaseYear) && rentalPeriod == other.rentalPeriod
				&& Double.doubleToLongBits(rentalRate) == Double.doubleToLongBits(other.rentalRate)
				&& Double.doubleToLongBits(replacementCost) == Double.doubleToLongBits(other.replacementCost)
				&& Objects.equals(specialFeatures, other.specialFeatures) && Objects.equals(title, other.title);
	}

}
