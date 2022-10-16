package com.ramy.moviereview.review;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("reviews")
public class ReviewController {

    private final String DELIMITER = "|";

    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService){
        String methodName = "ReviewController constructor" + DELIMITER;
        log.debug(methodName + "Enter.");

        this.reviewService = reviewService;

        log.debug(methodName + "Exit.");
    }

    @PostMapping(value = "/addReview", consumes = "application/json")
    public ResponseEntity<ReviewEntity> addReview(@RequestBody @Valid ReviewDTO reviewDTO){
        String methodName = "addReview()" + DELIMITER ;
        log.debug(methodName + "Enter with Review received" + DELIMITER + reviewDTO);

        log.debug(methodName + "Exit.");
        return ResponseEntity.status(HttpStatus.CREATED).body(reviewService.addReview(reviewDTO));
    }

}
