package org.stypox.composedemo

import androidx.compose.ui.graphics.vector.ImageVector

data class DeviceData(
    val title: String,
    val positionInHome: String,
    val icon: ImageVector,
    val description: String,
)