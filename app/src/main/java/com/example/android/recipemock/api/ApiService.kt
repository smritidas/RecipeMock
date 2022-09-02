package com.example.android.recipemock.api

import retrofit2.http.GET

//should I suspend?

interface ApiService {
    @GET("recipes")
    suspend fun getRecipes(): List<Recipe>
}
