package com.plcoding.cryptotracker.core.data.networking

import com.plcoding.cryptotracker.BuildConfig

/**
 * @Author: Angatia Benson
 * @Date: 10/19/2024
 * Copyright (c) 2024 BanIT
 */

fun constructUrl(url: String): String {
    return when {
        url.contains(BuildConfig.BASE_URL) -> url
        url.contains("/") -> BuildConfig.BASE_URL + url.drop(1)
        else -> BuildConfig.BASE_URL + url
    }
}