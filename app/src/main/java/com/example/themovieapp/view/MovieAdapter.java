package com.example.themovieapp.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.themovieapp.R;
import com.example.themovieapp.databinding.MovieListItemBinding;
import com.example.themovieapp.model.Movie;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private Context context;
    private ArrayList<Movie> movieArrayList;

    public MovieAdapter(Context context, ArrayList<Movie> movieArrayList) {
        this.context = context;
        this.movieArrayList = movieArrayList;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MovieListItemBinding binding = DataBindingUtil.
                inflate(
                        LayoutInflater.from(parent.getContext()),
                        R.layout.movie_list_item,
                        parent,
                        false
                );

        return new MovieViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie movie = movieArrayList.get(position);
        holder.movieListItemBinding.setMovie(movie);
    }

    @Override
    public int getItemCount() {
        return movieArrayList.size();
    }

    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        private MovieListItemBinding movieListItemBinding;

        public MovieViewHolder(MovieListItemBinding movieListItemBinding) {
            super(movieListItemBinding.getRoot());      // we get the movie_item_list view
            this.movieListItemBinding = movieListItemBinding;

            movieListItemBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }
}
