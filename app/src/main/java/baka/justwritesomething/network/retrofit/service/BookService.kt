package baka.justwritesomething.network.retrofit.service

import baka.justwritesomething.model.api.Book
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface BookService {

    @GET("books")
    fun getBookList(): Single<List<Book>>
}