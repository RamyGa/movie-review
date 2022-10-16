package com.ramy.moviereview.movie;


import javax.persistence.*;

@Entity
@Table(name= "MOVIE_ENTITY_TABLE")
public class MovieEntity {


    public MovieEntity(int id, String title, int yearOfRelease) {
        this.id = id;
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }
    public MovieEntity() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private int yearOfRelease;







}
