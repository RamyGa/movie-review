package com.ramy.moviereview.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    private ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }

    public ReviewEntity addReview(ReviewEntity reviewEntity){
        return reviewRepository.save(reviewEntity);
    }

}
