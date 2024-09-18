package com.refactor.practice.domain.movie.service.impl;

import com.refactor.practice.domain.movie.service.BaseMovieRentalCalculator;

import java.math.BigDecimal;

/**
 * 儿童影片计算器实现
 *
 * @author tengxq
 */
public class ChildrenMoviePriceCalculator extends BaseMovieRentalCalculator {

    public ChildrenMoviePriceCalculator(BigDecimal unitPrice) {
        super(unitPrice);
    }

    @Override
    protected BigDecimal calcPrice(Integer rentalDays) {
        BigDecimal price = unitPrice;
        if (rentalDays > 3) {
            price = price.add(unitPrice.multiply(new BigDecimal(rentalDays - 3)));
        }
        return price;
    }
}
