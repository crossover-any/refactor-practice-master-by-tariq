package com.refactor.practice.domain.movie.model.val;

import com.refactor.practice.Movie;
import com.refactor.practice.Rental;

/**
 * 电影租金计算指令
 *
 * @author tengxq
 */
public class MovieRentalCalcCommand {

    private Movie movie;

    private int dayRented;

    public MovieRentalCalcCommand(Rental rental) {
        this.movie = rental.getMovie();
        this.dayRented = rental.getDayRented();
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    public void setDayRented(int dayRented) {
        this.dayRented = dayRented;
    }
}
