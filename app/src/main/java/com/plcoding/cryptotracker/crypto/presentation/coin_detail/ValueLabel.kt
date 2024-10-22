package com.plcoding.cryptotracker.crypto.presentation.coin_detail

import java.text.NumberFormat
import java.util.Locale

/**
 * @Author: Angatia Benson
 * @Date: 10/22/2024
 * Copyright (c) 2024 BanIT
 */
data class ValueLabel(
    val value: Float,
    val unit: String,

    ) {
    fun formatted(): String {
        val formatter = NumberFormat.getNumberInstance(Locale.getDefault()).apply {
            val fractionDigits = when {
                value > 1000 -> 0
                value in 2f..999f -> 2
                else -> 3
            }
            maximumFractionDigits = fractionDigits
            minimumFractionDigits = 0
        }
        return "$unit${formatter.format(value)}"
    }
}
