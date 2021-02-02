package com.example.flowstudying.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MainViewModel(application: Application) : AndroidViewModel(application) {

    val books = getBooks().asLiveData()

    fun getBooks(): Flow<String> {
        return flow {
            val listBooks = listOf<String>(
                "Philosopher's Stone (1997)",
                "Chamber of Secrets (1998)",
                "Prisoner of Azkaban (1999",
                "Goblet of Fire (2000)",
                "Order of the Phoenix (2003)",
                "Half-Blood Prince (2005)",
                "Deathly Hallows (2007)"
            )

            for (book in listBooks) {
                delay(1000L)
                emit(book)
            }
        }
    }

}