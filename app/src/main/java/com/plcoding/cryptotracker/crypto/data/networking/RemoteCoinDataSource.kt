package com.plcoding.cryptotracker.crypto.data.networking

import com.plcoding.cryptotracker.core.data.networking.constructUrl
import com.plcoding.cryptotracker.core.data.networking.safeCall
import com.plcoding.cryptotracker.core.domain.util.NetworkError
import com.plcoding.cryptotracker.core.domain.util.Result
import com.plcoding.cryptotracker.core.domain.util.map
import com.plcoding.cryptotracker.crypto.data.mappers.toCoin
import com.plcoding.cryptotracker.crypto.data.networking.dto.CoinsResponseDto
import com.plcoding.cryptotracker.crypto.domain.Coin
import com.plcoding.cryptotracker.crypto.domain.CoinDataSource
import io.ktor.client.HttpClient
import io.ktor.client.request.get

/**
 * @Author: Angatia Benson
 * @Date: 10/19/2024
 * Copyright (c) 2024 BanIT
 */
class RemoteCoinDataSource(private val httpClient: HttpClient) : CoinDataSource {
    override suspend fun getCoins(): Result<List<Coin>, NetworkError> {
        return safeCall<CoinsResponseDto> {
            httpClient.get(
                urlString = constructUrl(url = "/assets")
            )
        }.map { response ->
            response.data.map { dto ->
                dto.toCoin()
            }
        }
    }
}