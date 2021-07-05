package baka.justwritesomething.repository.`interface`

import baka.justwritesomething.model.api.Book
import io.reactivex.rxjava3.core.Single

interface IBookRepo {
    fun getBooks(): Single<List<Book>>
}