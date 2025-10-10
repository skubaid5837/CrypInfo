package com.example.crypinfo.data.remote.dto

import com.example.crypinfo.domain.models.Coin

data class CoinDto(
    val id: String,
    val name: String,
    val symbol: String,
    val rank: Int,
    val is_new: Boolean,
    val is_active: Boolean,
    val type: String
)

fun CoinDto.toCoin() : Coin {
    return Coin(
        id = id,
        name = name,
        rank = rank,
        symbol = symbol,
        isActive = is_active
    )
}