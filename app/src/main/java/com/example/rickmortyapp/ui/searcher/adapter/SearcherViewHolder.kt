package com.example.rickmortyapp.ui.searcher.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.rickmortyapp.databinding.ItemCardCharacterBinding
import com.example.rickmortyapp.domain.models.Character

class SearcherViewHolder(view: View): ViewHolder(view){

    private var binding = ItemCardCharacterBinding.bind(view)

    fun render(character: Character) {
        binding.tvCharacter.text = character.name
    }

}