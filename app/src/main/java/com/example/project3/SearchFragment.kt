package com.example.project3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class SearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_search, container, false)
        val bookImage: ImageView = rootView.findViewById(R.id.searchbar)
        bookImage.setImageResource(R.drawable.search_bar) // mock search bar image
        return rootView
    }
}
