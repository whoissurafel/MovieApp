package com.example.kidusmt.movieapp.data;

import com.example.kidusmt.movieapp.data.remote.movie.MovieDto;

import io.reactivex.Observable;

/**
 * Created by KidusMT on 1/4/2018.
 */

public interface RepoMovieContract {

    Observable<Object> getMovies(String category);

    Observable<Boolean> updateMovies(MovieDto movieDto);

    int size();
}