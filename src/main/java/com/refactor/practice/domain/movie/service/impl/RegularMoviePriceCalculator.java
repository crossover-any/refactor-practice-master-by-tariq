package com.refactor.practice.domain.movie.service.impl;

import com.refactor.practice.domain.movie.service.BaseMovieRentalCalculator;

import java.math.BigDecimal;

/**
 * 普通影片计算器实现
 *
 * @author tengxq
 */
public class RegularMoviePriceCalculator extends BaseMovieRentalCalculator {

    public RegularMoviePriceCalculator(BigDecimal unitPrice) {
        super(unitPrice);
    }

    @Override
    protected BigDecimal calcPrice(Integer rentalDays) {
        BigDecimal price = unitPrice;
        if (rentalDays > 2) {
            price = price.add(new BigDecimal("1.5").multiply(new BigDecimal(rentalDays - 2)));
        }
        return price;
    }
}
