package com.plcoding.cryptotracker.core.domain.util

/**
 * @Author: Angatia Benson
 * @Date: 10/19/2024
 * Copyright (c) 2024 BanIT
 */
enum class NetworkError : Error {
    REQUEST_TIMEOUT,
    TOO_MANY_REQUESTS,
    NO_INTERNET_CONNECTION,
    SERVER_ERROR,
    SERIALIZATION,
    UNKNOWN_ERROR
}