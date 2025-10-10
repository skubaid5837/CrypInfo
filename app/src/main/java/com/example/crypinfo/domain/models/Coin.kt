package com.example.crypinfo.domain.models

data class Coin(
    val id: String,
    val name: String,
    val rank: Int,
    val symbol: String,
    val isActive: Boolean
)
