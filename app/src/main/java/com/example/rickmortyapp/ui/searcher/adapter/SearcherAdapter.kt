package com.example.rickmortyapp.ui.searcher.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rickmortyapp.R
import com.example.rickmortyapp.domain.models.Character


class SearcherAdapter(private val listCharacter: List<Character>) : RecyclerView.Adapter<SearcherViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearcherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card_character, parent, false)
        return SearcherViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCharacter.size
    }

    override fun onBindViewHolder(holder: SearcherViewHolder, position: Int) {
        holder.render(listCharacter[position])
    }


}