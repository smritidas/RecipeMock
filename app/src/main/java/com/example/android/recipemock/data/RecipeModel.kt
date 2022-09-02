package com.example.android.recipemock

import com.squareup.moshi.JsonClass
import com.squareup.moshi.Json


class RecipeModel : ArrayList<RecipeModelItem>()

@JsonClass(generateAdapter = true)
data class RecipeModelItem(
    @Json(name = "calories")
    val calories: String,
    @Json(name = "carbos")
    val carbos: String,
    @Json(name = "country")
    val country: String?,
    @Json(name = "description")
    val description: String,
    @Json(name = "difficulty")
    val difficulty: Int,
    @Json(name = "fats")
    val fats: String,
    @Json(name = "headline")
    val headline: String,
    @Json(name = "id")
    val id: String,
    @Json(name = "image")
    val image: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "proteins")
    val proteins: String,
    @Json(name = "thumb")
    val thumb: String,
    @Json(name = "time")
    val time: String
)