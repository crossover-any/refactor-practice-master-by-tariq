package com.refactor.practice.domain.movie.service.impl;

import com.refactor.practice.domain.movie.service.BaseMovieRentalCalculator;

import java.math.BigDecimal;

/**
 * 新影片计算器实现
 *
 * @author tengxq
 */
public class NewReleaseMoviePriceCalculator extends BaseMovieRentalCalculator {

    public NewReleaseMoviePriceCalculator(BigDecimal unitPrice) {
        super(unitPrice);
    }

    @Override
    protected Integer calcPoints(Integer rentalDays) {
        return rentalDays > 1? 2: 1;
    }
}
