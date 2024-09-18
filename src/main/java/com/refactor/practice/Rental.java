package com.refactor.practice;

public class Rental {
	private final Movie movie;

	private final int dayRented;
	public Rental(Movie movie, int dayRented) {
		this.movie = movie;
		this.dayRented = dayRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getDayRented() {
		return dayRented;
	}
}
