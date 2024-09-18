package com.refactor.practice;

import com.refactor.practice.domain.movie.factory.MoviePriceCalculatorFactory;
import com.refactor.practice.domain.movie.model.val.MovieRentalCalcCommand;
import com.refactor.practice.domain.movie.model.val.MovieRentalCalcResult;
import com.refactor.practice.domain.movie.service.MovieRentalCalculator;

import java.math.BigDecimal;
import java.util.Vector;

public class Customer {
	private final String name;
	private final Vector<Rental> rentals;

	public Customer(String name, Vector<Rental> rentals) {
		this.name = name;
		this.rentals = rentals;
	}

	public String getName() {
		return name;
	}

	public void addRental(Rental arg) {
		rentals.add(arg);
	}

	public String statement() {
		BigDecimal totalAmount = BigDecimal.ZERO;
		int frequentRenterPoints = 0;
		StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");
		for (Rental each : this.rentals) {
			MovieRentalCalculator calculator = MoviePriceCalculatorFactory.getCalculator(each.getMovie().getPriceCode());
			MovieRentalCalcResult calcResult = calculator.calc(new MovieRentalCalcCommand(each));
			// add total
			totalAmount = totalAmount.add(calcResult.getAmount());
			frequentRenterPoints += calcResult.getFrequentRenterPoints();
			//show figures for this rental
			result.append("\t")
					.append(each.getMovie().getTitle())
					.append("\t")
					.append(calcResult.getAmount())
					.append("\n");
		}
		//add footer lines
		result.append("Amount owed is ").append(totalAmount).append("\n");
		result.append("You earned").append(frequentRenterPoints).append(" frequent renter points");
		return result.toString();
	}
}
