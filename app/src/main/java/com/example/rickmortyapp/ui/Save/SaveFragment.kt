package com.example.rickmortyapp.ui.Save

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rickmortyapp.databinding.FragmentSaveBinding
import com.example.rickmortyapp.databinding.FragmentSearcherBinding

class SaveFragment : Fragment() {

    private lateinit var binding: FragmentSaveBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSaveBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}