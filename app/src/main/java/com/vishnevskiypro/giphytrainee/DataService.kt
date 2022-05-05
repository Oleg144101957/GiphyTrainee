package com.vishnevskiypro.giphytrainee

import retrofit2.Call
import retrofit2.http.GET

interface DataService {
    @GET("gifs/trending?api_key=WWNeb31bktlpWnOvt9H5pvuk9H7BoSQ9") //API key
    fun getGifs(): Call<DataResult>
}