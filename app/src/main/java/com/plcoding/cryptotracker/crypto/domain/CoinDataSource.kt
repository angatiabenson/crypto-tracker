package com.plcoding.cryptotracker.crypto.domain

import com.plcoding.cryptotracker.core.domain.util.NetworkError
import com.plcoding.cryptotracker.core.domain.util.Result

/**
 * @Author: Angatia Benson
 * @Date: 10/19/2024
 * Copyright (c) 2024 BanIT
 */
interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}