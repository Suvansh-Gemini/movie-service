package com.example.movieservice.Controller;

import com.example.movieservice.Model.Movie;
import com.example.movieservice.Service.Interface.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
@Slf4j
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/who")
    public String whoDeployed(){
        log.info("Inside whoDeployed() method in MovieController with no parameters");
        return "Deployed by Suvansh Shukla Oct 26";
    }

    @GetMapping("/list")
    public List<Movie> getMovies(){
        log.info("Inside getMovies() method in MovieController with no parameters");
        return movieService.getMovies();
    }
}
