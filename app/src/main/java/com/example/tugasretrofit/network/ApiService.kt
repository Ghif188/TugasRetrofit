package com.example.tugasretrofit.network

import com.example.tugasretrofit.model.FilmModel
import com.example.tugasretrofit.model.PokemonModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("data.php")
    fun getData(): Call<FilmModel>
}