package com.example.crypinfo.domain.repository

import com.example.crypinfo.data.remote.dto.CoinDetailDto
import com.example.crypinfo.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}