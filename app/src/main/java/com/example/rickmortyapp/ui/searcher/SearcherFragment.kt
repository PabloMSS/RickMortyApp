package com.example.rickmortyapp.ui.searcher

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rickmortyapp.databinding.FragmentSearcherBinding

class SearcherFragment : Fragment() {

    private lateinit var binding: FragmentSearcherBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearcherBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}