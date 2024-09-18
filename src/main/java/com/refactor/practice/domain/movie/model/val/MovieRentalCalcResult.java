package com.refactor.practice.domain.movie.model.val;

import java.math.BigDecimal;

/**
 * 电影租金计算结果
 *
 * @author tengxq
 */
public class MovieRentalCalcResult {

    BigDecimal amount = BigDecimal.ZERO;

    int frequentRenterPoints = 0;

    public MovieRentalCalcResult(BigDecimal amount, int frequentRenterPoints) {
        this.amount = amount;
        this.frequentRenterPoints = frequentRenterPoints;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }

    public void setFrequentRenterPoints(int frequentRenterPoints) {
        this.frequentRenterPoints = frequentRenterPoints;
    }
}
