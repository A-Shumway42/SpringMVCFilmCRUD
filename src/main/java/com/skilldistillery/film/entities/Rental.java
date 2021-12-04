package com.skilldistillery.film.entities;

import java.time.LocalDateTime;

public class Rental {
	private int id;
	private LocalDateTime rentalDate;
	private LocalDateTime returnDate;

	protected Rental() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(LocalDateTime rentalDate) {
		this.rentalDate = rentalDate;
	}

	public LocalDateTime getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDateTime returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return "Rental [id: " + id + ", rentalDate: " + rentalDate + ", returnDate: " + returnDate + "]";
	}

}
