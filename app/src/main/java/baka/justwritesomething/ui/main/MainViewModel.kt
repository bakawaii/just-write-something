package baka.justwritesomething.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import baka.justwritesomething.repository.BookRepo
import baka.justwritesomething.repository.`interface`.IBookRepo

class MainViewModel : ViewModel() {

    private val bookRepo: IBookRepo = BookRepo()

    fun getBookList() {
        bookRepo.getBooks()
            .subscribe({ bookList ->

            }, { throwable ->
                Log.e("DEBUGG", "error: ", throwable)
            })
    }
}