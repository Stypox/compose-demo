package org.stypox.composedemo

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AcUnit
import androidx.compose.material.icons.filled.Carpenter
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.Palette
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.PreviewParameterProvider

data class DeviceData(
    val title: String,
    val positionInHome: String,
    val icon: ImageVector,
    val description: String,
)

val deviceDataList = listOf(
    DeviceData(
        title = "Blue light",
        positionInHome = "Entrance",
        icon = Icons.Default.Lightbulb,
        description = "Installed at the front entrance, the Entry Blue Bulb emits a gentle blue light, creating a tranquil and inviting ambiance. It's perfect for setting a relaxing mood as you step inside. Easy to control through the app, you can adjust the brightness to suit your preference.",
    ),
    DeviceData(
        title = "Air conditioning unit",
        positionInHome = "Loft",
        icon = Icons.Default.AcUnit,
        description = "My trusted companion for beating the summer heat. This AC creates a refreshing oasis in the top loft. Set your preferred temperature and let it work its magic. Don't forget to adjust the fan speed for maximum comfort!",
    ),
    DeviceData(
        title = "Speck cutter",
        positionInHome = "Kitchen",
        icon = Icons.Default.Carpenter,
        description = "The secret to perfect speck bites! This machine is a game-changer for Speck&Tech meetings. Slide in your speck, press a button, and voilà – ready-to-eat slices. Cleanup is a breeze too. An essential for any speck lover.",
    ),
    DeviceData(
        title = "Lemon gallery",
        positionInHome = "Main room",
        icon = Icons.Default.Palette,
        description = "These lemon paintings are my daily dose of sunshine. Toggle them on for an instant mood lift. They're not just art; they're a state of mind. Use the app to bring the joy or keep them tucked away. Your space, your vibe.",
    ),
)

class DeviceDataPreviewParameterProvider : PreviewParameterProvider<DeviceData> {
    override val values = deviceDataList.asSequence()
}