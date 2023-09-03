package ru.netology.movieManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.movieManager.MovieManager;


public class MovieManagerTest {

    @Test
    public void shouldAddFilms() {
        MovieManager manager = new MovieManager();
        manager.add("Film A");
        manager.add("Film B");
        manager.add("Film C");

        String[] expected = {"Film A", "Film B", "Film C" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldDisplaysMoviesInReverseOrderLimitMore() {
        MovieManager manager = new MovieManager();
        manager.add("Film A");
        manager.add("Film B");
        manager.add("Film C");
        manager.add("Film D");
        manager.add("Film E");
        manager.add("Film F");
        manager.add("Film G");
        manager.add("Film H");
        manager.add("Film I");

        String[] expected = {"Film I", "Film H", "Film G", "Film F", "Film E"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldDisplaysMoviesInReverseOrderLimitMin() {
        MovieManager manager = new MovieManager();
        manager.add("Film A");
        manager.add("Film B");
        manager.add("Film C");

        String[] expected = {"Film C", "Film B", "Film A"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
