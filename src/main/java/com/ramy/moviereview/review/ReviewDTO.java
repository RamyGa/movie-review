package com.ramy.moviereview.review;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReviewDTO {
    private long id;
    private String shortReviewDescription;
    private double overAllRating;
}
