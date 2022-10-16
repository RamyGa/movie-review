package com.ramy.moviereview.configuration;

import com.ramy.moviereview.review.ReviewDTO;
import com.ramy.moviereview.review.ReviewEntity;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {

    @Bean
    public MapperFactory mapperFactory(){
        DefaultMapperFactory mapperFactory = new DefaultMapperFactory.Builder()
                .dumpStateOnException(false)
                .useBuiltinConverters(true)
                .build();

        mapperFactory.classMap(ReviewDTO.class, ReviewEntity.class)
                .mapNulls(true)
                .byDefault()
                .register();

        return mapperFactory;
    }

    @Bean
    MapperFacade mapper(MapperFactory mapperFactory){
        return mapperFactory.getMapperFacade();
    }

}
