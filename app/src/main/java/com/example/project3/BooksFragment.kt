package com.example.project3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class BooksFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_books, container, false)

        // set up data for the books in this view
        val bookImage5: ImageView = view.findViewById(R.id.bookImage5)
        val bookTitle5: TextView = view.findViewById(R.id.bookTitle5)
        val bookImage4: ImageView = view.findViewById(R.id.bookImage4)
        val bookTitle4: TextView = view.findViewById(R.id.bookTitle4)
        val bookImage7: ImageView = view.findViewById(R.id.bookImage7)
        val bookTitle7: TextView = view.findViewById(R.id.bookTitle7)
        val bookImage1: ImageView = view.findViewById(R.id.bookImage1)
        val bookTitle1: TextView = view.findViewById(R.id.bookTitle1)
        val bookImage2: ImageView = view.findViewById(R.id.bookImage2)
        val bookTitle2: TextView = view.findViewById(R.id.bookTitle2)
        val bookImage3: ImageView = view.findViewById(R.id.bookImage3)
        val bookTitle3: TextView = view.findViewById(R.id.bookTitle3)

        // image and book title
        bookImage1.setImageResource(R.drawable.book1)
        bookTitle1.text = "The Wedding People, By: Alison Espach"

        bookImage2.setImageResource(R.drawable.book2)
        bookTitle2.text = "Funny Story, By: Emily Henry"

        bookImage3.setImageResource(R.drawable.book3)
        bookTitle3.text = "How to End a Love Story, By: Yulin Kuang"

        return view
    }
}
