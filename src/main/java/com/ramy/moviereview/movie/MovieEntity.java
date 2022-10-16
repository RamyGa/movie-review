package com.ramy.moviereview.movie;

import com.ramy.moviereview.review.ReviewEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name= "MOVIE_ENTITY_TABLE")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotEmpty(message = "Title is required")
    private String title;

    @NotEmpty(message = "Release year is required")
    private int yearOfRelease;

    @OneToOne
    @JoinColumn(name = "review_id")
    private ReviewEntity review;
    //TODO - add movie poster

}
