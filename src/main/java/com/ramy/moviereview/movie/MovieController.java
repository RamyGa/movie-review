package com.ramy.moviereview.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("movies")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @PostMapping("/addMovie")
    public ResponseEntity<MovieEntity> addMovie(@RequestBody @Valid MovieEntity movieDTO){ //todo - update to moviedto
        return ResponseEntity.status(HttpStatus.CREATED).body(movieService.addMovie(movieDTO));
    }

}
