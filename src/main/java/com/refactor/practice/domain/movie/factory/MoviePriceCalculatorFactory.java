package com.refactor.practice.domain.movie.factory;

import com.refactor.practice.Movie;
import com.refactor.practice.domain.movie.service.MovieRentalCalculator;
import com.refactor.practice.domain.movie.service.impl.ChildrenMoviePriceCalculator;
import com.refactor.practice.domain.movie.service.impl.NewReleaseMoviePriceCalculator;
import com.refactor.practice.domain.movie.service.impl.RegularMoviePriceCalculator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tengxq
 */
public class MoviePriceCalculatorFactory {

    private static final Map<Integer, MovieRentalCalculator> dic = new HashMap<>();

    static {
        // 配置分类单价与注册实现
        dic.put(Movie.REGULAR, new RegularMoviePriceCalculator(new BigDecimal("2.0")));
        dic.put(Movie.NEW_RELEASE, new NewReleaseMoviePriceCalculator(new BigDecimal("3.0")));
        dic.put(Movie.CHILDREN, new ChildrenMoviePriceCalculator(new BigDecimal("1.5")));
    }

    public  static MovieRentalCalculator getCalculator(Integer movieType){
        MovieRentalCalculator movieRentalCalculator = dic.get(movieType);
        assert movieRentalCalculator !=null;
        return movieRentalCalculator;
    }
}
