package org.stypox.composedemo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun DevicePanel(@PreviewParameter(DeviceDataPreviewParameterProvider::class) data: DeviceData) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Icon(
            imageVector = data.icon,
            contentDescription = data.title,
            modifier = Modifier.size(32.dp),
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = data.title,
                style = MaterialTheme.typography.titleMedium,
            )
            Text(
                text = data.positionInHome,
                style = MaterialTheme.typography.bodyMedium,
            )
        }
    }
}