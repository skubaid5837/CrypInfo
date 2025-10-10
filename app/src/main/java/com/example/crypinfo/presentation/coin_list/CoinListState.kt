package com.example.crypinfo.presentation.coin_list

import com.example.crypinfo.domain.models.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
