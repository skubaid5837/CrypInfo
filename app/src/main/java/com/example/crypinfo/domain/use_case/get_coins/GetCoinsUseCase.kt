package com.example.crypinfo.domain.use_case.get_coins

import android.R.attr.tag
import android.util.Log
import com.example.crypinfo.common.Resource
import com.example.crypinfo.data.remote.dto.toCoin
import com.example.crypinfo.domain.models.Coin
import com.example.crypinfo.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success(coins))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Check your internet connection"))
        }
    }
}