package com.ramy.moviereview.review;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @NotEmpty(message="shortReviewDescription is required")
    private String shortReviewDescription;

    @Range(min = 1, max = 10, message = "Overall Rating must be between 1 and 10")
    private double overAllRating;
}
