package com.example.crypinfo.data.repository

import android.util.Log
import com.example.crypinfo.data.remote.CoinPaprikaApi
import com.example.crypinfo.data.remote.dto.CoinDetailDto
import com.example.crypinfo.data.remote.dto.CoinDto
import com.example.crypinfo.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImp @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}