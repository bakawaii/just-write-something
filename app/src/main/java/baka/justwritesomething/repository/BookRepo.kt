package baka.justwritesomething.repository

import baka.justwritesomething.model.api.Book
import baka.justwritesomething.repository.`interface`.IBookRepo
import io.reactivex.rxjava3.core.Single

class BookRepo : IBookRepo {

    override fun getBooks(): Single<List<Book>> {
        TODO("Not yet implemented")
    }
}