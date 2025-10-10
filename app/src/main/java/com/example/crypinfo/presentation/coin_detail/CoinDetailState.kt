package com.example.crypinfo.presentation.coin_detail

import com.example.crypinfo.domain.models.Coin
import com.example.crypinfo.domain.models.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
