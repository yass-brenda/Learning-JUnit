package movies.data;

import movies.model.Genre;
import movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;


public class MovieRepositoryJdbcTest {
    @Test
    public void loaded_all_movies() throws SQLException {
        // Connection BD
        DataSource dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL","root","root");
        ScriptUtils.executeSqlScript(dataSource.getConnection(),new ClassPathResource("scripts/test-data.sql"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        MovieRepositoryJdbc movieRepository = new MovieRepositoryJdbc(jdbcTemplate);
        Collection<Movie> movies = movieRepository.findAll();
        List<Movie> list = Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION),
                new Movie(2, "Memento", 113, Genre.THRILLER),
                new Movie(3, "Matrix", 136, Genre.ACTION)
        );
        assertEquals(movies,list);
    }

}