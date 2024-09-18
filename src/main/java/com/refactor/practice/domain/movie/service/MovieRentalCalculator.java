package com.refactor.practice.domain.movie.service;

import com.refactor.practice.domain.movie.model.val.MovieRentalCalcCommand;
import com.refactor.practice.domain.movie.model.val.MovieRentalCalcResult;

/**
 * 电影租金计算器
 *
 * @author tengxq
 */
public interface MovieRentalCalculator {

    /**
     * 计算租借价格
     *
     * @param command 指令参数
     * @return 返回结果
     */
    MovieRentalCalcResult calc(MovieRentalCalcCommand command);


}
