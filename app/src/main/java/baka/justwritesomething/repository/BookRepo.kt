package baka.justwritesomething.repository

import baka.justwritesomething.model.api.Book
import baka.justwritesomething.network.retrofit.service.BookService
import baka.justwritesomething.repository.`interface`.IBookRepo
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

class BookRepo : IBookRepo {

    // inject
    private val retrofit = Retrofit.Builder()
        .baseUrl("baseUrl")
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    private val service: BookService = retrofit.create(BookService::class.java)

    override fun getBooks(): Single<List<Book>> {
        return service.getBookList()
            .subscribeOn(Schedulers.io())
    }
}