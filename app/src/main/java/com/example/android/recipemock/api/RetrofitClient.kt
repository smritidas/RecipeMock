package com.example.android.recipemock.api

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create

private const val BASE_URL =
    "https://hf-android-app.s3-eu-west-1.amazonaws.com/android-test/recipes.json"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

object RetrofitClient {
    val apiService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}


