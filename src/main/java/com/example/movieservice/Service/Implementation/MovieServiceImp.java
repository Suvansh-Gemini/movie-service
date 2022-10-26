package com.example.movieservice.Service.Implementation;

import com.example.movieservice.Model.Movie;
import com.example.movieservice.Service.Interface.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
@Slf4j
public class MovieServiceImp implements MovieService {
    @Override
    public List<Movie> getMovies() {
        log.info("Inside getMovies() method in MovieServiceImp with no parameters");
        return Stream.of(
                new Movie(1, "Avatar", 3),
                new Movie(2, "Iron Man", 3),
                new Movie(3, "Spider-Man", 4)
        ).toList();
    }
}
