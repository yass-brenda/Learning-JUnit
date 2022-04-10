package movies.service;

import movies.data.MovieRepository;
import movies.model.Genre;
import movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;



import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MovieServiceTest {

    MovieService movieService;

    @Before
    public void setUp() throws Exception {
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);
        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1,"The Time",13,Genre.HORROR),
                        new Movie(2,"The Jungle",15,Genre.HORROR),
                        new Movie(3,"The World",18,Genre.COMEDY),
                        new Movie(4,"The World",20,Genre.COMEDY)
                )
        );
        movieService = new MovieService(movieRepository);

    }

    @Test
    public void return_movie_for_genre(){
        Collection<Movie> movies = movieService.findMovieByGenre(Genre.COMEDY);
        assertThat(getMoviesId(movies), CoreMatchers.is(Arrays.asList(3,4)));
    }

    @Test
    public void return_movir_by_durartion(){
        Collection<Movie> movies = movieService.findByLength(19);
        assertThat(getMoviesId(movies), CoreMatchers.is(Arrays.asList(1,2,3)));
    }

    private List<Integer> getMoviesId(Collection<Movie> movies) {
        return movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());
    }

}