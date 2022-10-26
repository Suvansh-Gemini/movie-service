package com.example.movieservice.Service.Interface;

import com.example.movieservice.Model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MovieService {
    List<Movie> getMovies();
}
