package com.plcoding.cryptotracker.crypto.presentation.coin_detail

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit

/**
 * @Author: Angatia Benson
 * @Date: 10/22/2024
 * Copyright (c) 2024 BanIT
 */
data class ChartStyle(
    val chartLineColor: Color,
    val unselectedColor: Color,
    val selectedColor: Color,
    val helperLinesThicknessPx: Float,
    val axisLinesThicknessPx: Float,
    val labelFontSize: TextUnit,
    val minYLabelSpacing: Dp,
    val verticalPadding: Dp,
    val horizontalPadding: Dp,
    val xAxisLabelSpacing: Dp
)
