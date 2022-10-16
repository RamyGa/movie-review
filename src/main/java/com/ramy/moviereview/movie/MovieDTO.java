package com.ramy.moviereview.movie;

import com.ramy.moviereview.review.ReviewDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MovieDTO {

    private int id;
    private String title;
    private int yearOfRelease;
    private ReviewDTO review;

}
