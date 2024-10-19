package com.plcoding.cryptotracker.crypto.presentation.coin_list

import com.plcoding.cryptotracker.crypto.presentation.models.CoinUi

/**
 * @Author: Angatia Benson
 * @Date: 10/19/2024
 * Copyright (c) 2024 BanIT
 */

sealed interface CoinListAction {
    data class OnCoinClick(val coin: CoinUi) : CoinListAction
    data object OnRefresh : CoinListAction
}