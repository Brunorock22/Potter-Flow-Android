package com.example.flowstudying

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*


class ListAdapter : RecyclerView.Adapter<ListAdapter.MyHolder>() {

    inner class MyHolder(var view: View) : RecyclerView.ViewHolder(view.rootView) {

        fun bind(language: String) {
            view.item_title.text = language
        }
    }

    private val books: MutableList<String> = mutableListOf()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)

        return MyHolder(view)
    }

    override fun getItemCount(): Int = books.size

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(books[position])
    }

    fun addLanguage(book: String) {
        books.add(book)
        notifyDataSetChanged()
    }

}