package io.inflix.moviinfoservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.inflix.moviinfoservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		return new Movie("1","Transformer");
	}

}
