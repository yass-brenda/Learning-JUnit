package movies.data;

import movies.model.Genre;
import movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;


public class MovieRepositoryJdbcTest {

    private MovieRepositoryJdbc movieRepository;
    private DataSource dataSource;
    @Before
    public void setUp() throws Exception {
         dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL","root","root");
        ScriptUtils.executeSqlScript(dataSource.getConnection(),new ClassPathResource("scripts/test-data.sql"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        movieRepository = new MovieRepositoryJdbc(jdbcTemplate);
    }

    @Test
    public void loaded_all_movies() throws SQLException {
        // Connection BD
        Collection<Movie> movies = movieRepository.findAll();
        assertThat(movies,CoreMatchers.is(Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION,"Ulisses"),
                new Movie(2, "Memento", 113, Genre.THRILLER,"Ulisses"),
                new Movie(3, "Matrix", 136, Genre.ACTION, "Diego")
        )));
    }

    @Test
    public void load_movie(){
        Movie movie = movieRepository.findById(2);
        assertThat(movie,CoreMatchers.is(new Movie(2, "Memento", 113, Genre.THRILLER,"Ulisses")));
    }

    @Test
    public void insert_one_movie(){
        Movie movie = new Movie("Super 8",112,Genre.THRILLER,"Diego");
        movieRepository.saveOrUpdate(movie);
        Movie movieFromDb = movieRepository.findById(4);
        assertThat(movieFromDb,CoreMatchers.is(new Movie(4, "Super 8",112,Genre.THRILLER,"Diego")));
    }

    // Borrar o reiniciar base de datos.
    @After
    public void tearDown() throws Exception{
        final Statement s = dataSource.getConnection().createStatement();
        s.execute("drop all objects delete files");
    }
        
}

