package com.plcoding.cryptotracker.crypto.domain

import java.time.ZonedDateTime

/**
 * @Author: Angatia Benson
 * @Date: 10/22/2024
 * Copyright (c) 2024 BanIT
 */
data class CoinPrice(
    val priceUsd: Double,
    val dateTime: ZonedDateTime
)
