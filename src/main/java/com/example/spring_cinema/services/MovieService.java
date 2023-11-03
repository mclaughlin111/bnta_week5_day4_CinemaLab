package com.example.spring_cinema.services;

import com.example.spring_cinema.models.Movie;
import com.example.spring_cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // turns this class into a Bean
public class MovieService {
    @Autowired // "dependency injection"
    MovieRepository movieRepository;


    public List<Movie> getMovies(){
        return movieRepository.findAll();
    }

    public void saveMovie(Movie givenMovie){
        movieRepository.save(givenMovie);
    }
    // should return? void / not void

    public Optional<Movie> getMovieById(long id) {
//        assert movieRepository != null;
        return movieRepository.findById(id);
    }



//    public String getMovieByID(){
//
//    }
}
