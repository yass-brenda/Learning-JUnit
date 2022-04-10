package movies.service;

import movies.data.MovieRepository;
import movies.model.Genre;
import movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {

    MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }



    public Collection<Movie> findMovieByGenre(Genre genre) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }

    public Collection<Movie> findByLength(int duration) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getMinutes() <= duration).collect(Collectors.toList());
    }
}
