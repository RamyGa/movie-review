package com.ramy.moviereview.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //business logic will reside in the service layer
public class MovieService {


    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }





    public MovieEntity addMovie(MovieEntity movieEntity){
        return movieRepository.save(movieEntity);
    }

    public List<MovieEntity> saveMovies(List<MovieEntity> movieEntities){
        return movieRepository.saveAll(movieEntities);
    }

    public List<MovieEntity> getMovies(){
        return movieRepository.findAll();
    }

    public MovieEntity getMovie(int id){
        return movieRepository.findById(id).orElse(null);
    }

//    public MovieEntity getMovieByName(String name){
//        return movieRepository.findByName(name);
//    }



}
