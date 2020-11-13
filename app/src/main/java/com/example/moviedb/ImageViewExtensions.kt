package com.example.moviedb

import android.net.Uri
import androidx.appcompat.widget.AppCompatImageView
import com.squareup.picasso.Picasso

fun AppCompatImageView.loadImage(image: String) {
    Picasso.get().load(Uri.parse(image)).into(this)
}