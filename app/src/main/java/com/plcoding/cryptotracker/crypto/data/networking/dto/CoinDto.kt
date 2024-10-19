package com.plcoding.cryptotracker.crypto.data.networking.dto

import kotlinx.serialization.Serializable

/**
 * @Author: Angatia Benson
 * @Date: 10/19/2024
 * Copyright (c) 2024 BanIT
 */
@Serializable
data class CoinDto(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUsd: Double,
    val priceUsd: Double,
    val changePercent24Hr: Double
)