package com.example.moviedb

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val movieList: List<Movie>) : RecyclerView.Adapter<MovieAdapter.MovieAdapterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return MovieAdapterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieAdapterViewHolder, position: Int) {
        holder.bind(movieList[position])
    }

    class MovieAdapterViewHolder(val view : View) : RecyclerView.ViewHolder(view) {
        private val movieImage: AppCompatImageView = view.findViewById(R.id.image)
        private val titleMovie: AppCompatTextView = view.findViewById(R.id.title)
        private val descriptionMovie: AppCompatTextView = view.findViewById(R.id.description)

        fun bind(movie: Movie) {
            movieImage.loadImage(movie.image)
            titleMovie.text = movie.title
            descriptionMovie.text = movie.description
        }
    }
}