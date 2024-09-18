package com.refactor.practice.domain.movie.service;

import com.refactor.practice.domain.movie.model.val.MovieRentalCalcCommand;
import com.refactor.practice.domain.movie.model.val.MovieRentalCalcResult;

import java.math.BigDecimal;

/**
 * 电影租金计算器基类实现
 *
 * @author tengxq
 */
public abstract class BaseMovieRentalCalculator implements MovieRentalCalculator {
    protected  BigDecimal unitPrice;

    public BaseMovieRentalCalculator(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
   public MovieRentalCalcResult calc(MovieRentalCalcCommand command){
       BigDecimal price = calcPrice(command.getDayRented());
       Integer points = calcPoints(command.getDayRented());
       return new MovieRentalCalcResult(price, points);
   }

    /**
     * 计算价格
     *
     * @param rentalDays 租借时长
     * @return 租金价格 默认实现是 单价*天数
     */
    protected  BigDecimal calcPrice(Integer rentalDays) {
        return unitPrice.multiply(new BigDecimal(rentalDays));
    }

    /**
     * 计算积分
     *
     * @param rentalDays 租借时间
     * @return 积分点数 默认实现返回1
     */
    protected Integer calcPoints(Integer rentalDays) {
        return 1;
    }
}
