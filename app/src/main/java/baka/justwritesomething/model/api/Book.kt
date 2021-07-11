package baka.justwritesomething.model.api

import com.squareup.moshi.Json

data class Book(
    @field:Json(name = "id") val id: String,
    @field:Json(name = "name") val name: String)