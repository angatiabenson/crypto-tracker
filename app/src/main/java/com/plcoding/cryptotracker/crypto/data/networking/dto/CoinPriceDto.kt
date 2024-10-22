package com.plcoding.cryptotracker.crypto.data.networking.dto

import kotlinx.serialization.Serializable

/**
 * @Author: Angatia Benson
 * @Date: 10/22/2024
 * Copyright (c) 2024 BanIT
 */

@Serializable
data class CoinPriceDto(
    val priceUsd: Double,
    val time: Long
)
