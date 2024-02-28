package com.example.rickmortyapp.domain.models

data class Character(
    val id: Int,
    val name: String,
    val species: String,
    val image: String
)