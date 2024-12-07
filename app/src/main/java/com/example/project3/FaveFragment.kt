package com.example.project3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class FaveFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_fave, container, false)

        // book data
        val bookImage1: ImageView = view.findViewById(R.id.bookImage1)
        val bookTitle1: TextView = view.findViewById(R.id.bookTitle1)
        val bookImage2: ImageView = view.findViewById(R.id.bookImage2)
        val bookTitle2: TextView = view.findViewById(R.id.bookTitle2)
        val bookImage3: ImageView = view.findViewById(R.id.bookImage3)
        val bookTitle3: TextView = view.findViewById(R.id.bookTitle3)

        // image and text
        bookImage1.setImageResource(R.drawable.book1)
        bookTitle1.text = "The Wedding People, By: Alison Espach"

        bookImage2.setImageResource(R.drawable.book2)
        bookTitle2.text = "Funny Story, By: Emily Henry"

        bookImage3.setImageResource(R.drawable.book3)
        bookTitle3.text = "How to End a Love Story, By: Yulin Kuang"

        return view
    }
}
