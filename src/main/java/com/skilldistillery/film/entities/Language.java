package com.skilldistillery.film.entities;

public class Language {
	private int id;
	private String name;

	protected Language() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Language [id: " + id + ", name: " + name + "]";
	}

}
