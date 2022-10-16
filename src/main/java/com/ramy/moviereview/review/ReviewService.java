package com.ramy.moviereview.review;

import lombok.extern.slf4j.Slf4j;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ReviewService {

    private final String DELIMITER = "|";

    private final ReviewRepository reviewRepository;
    private final MapperFacade mapperFacade;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository, MapperFacade mapperFacade){
        String methodName = "ReviewService constructor" + DELIMITER;
        log.debug(methodName + "Enter.");

        this.reviewRepository = reviewRepository;
        this.mapperFacade = mapperFacade;

        log.debug(methodName + "Exit.");
    }

    public ReviewEntity addReview(ReviewDTO reviewDTO){
        String methodName = "addReview()" + DELIMITER;
        log.debug(methodName + "Enter.");

        ReviewEntity reviewEntity = mapperFacade.map(reviewDTO, ReviewEntity.class);
        reviewEntity = reviewRepository.save(reviewEntity);

        log.debug(methodName + "Exit with Review returned from database: " + reviewEntity);
        return reviewEntity;
    }

}
