package com.example.kidusmt.movieapp.data.local.genre;

import com.example.kidusmt.movieapp.data.local.movie.MovieLocalContract;
import com.example.kidusmt.movieapp.data.remote.movie.Movie;
import com.example.kidusmt.movieapp.data.remote.movie.Movie_;

import java.util.ArrayList;
import java.util.List;

import io.objectbox.Box;
import io.objectbox.BoxStore;
import io.reactivex.Observable;

/**
 *
 */
public class GenreLocal implements MovieLocalContract {

    private Box<Movie> box;

    public GenreLocal(BoxStore store) {
        box = store.boxFor(Movie.class);
    }

    @Override
    public Observable<Boolean> putAll(List<Movie> movies) {
        // TODO: Remove movies by category
        box.put(movies);
        return Observable.just(true);
    }

    @Override
    public Observable<List<Movie>> getByCategory(String category) {
//        List<Movie> movies = box.find(Movie_.category, category);
        List<Movie> movies = new ArrayList<>();
        return Observable.just(movies);
    }


    @Override
    public int size() {
        return box.getAll().size();
    }
}
