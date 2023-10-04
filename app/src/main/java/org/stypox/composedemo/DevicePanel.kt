package org.stypox.composedemo

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun DevicePanel(@PreviewParameter(DeviceDataPreviewParameterProvider::class) data: DeviceData) {
    var expanded by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .animateContentSize(),
    ) {
        DeviceHeader(data, expanded) { expanded = !expanded }

        if (expanded) {
            Spacer(modifier = Modifier.height(8.dp))
            DeviceFooter(data = data)
        }
    }
}

@Composable
fun DeviceHeader(
    data: DeviceData,
    expanded: Boolean,
    onToggleExpanded: () -> Unit,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            imageVector = data.icon,
            contentDescription = data.title,
            modifier = Modifier.size(32.dp),
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(
            modifier = Modifier.weight(1.0f)
        ) {
            Text(
                text = data.title,
                style = MaterialTheme.typography.titleMedium,
            )
            Text(
                text = data.positionInHome,
                style = MaterialTheme.typography.bodyMedium,
            )
        }
        ElevatedButton(onClick = onToggleExpanded) {
            Text(text = if (expanded) "Less" else "More")
        }
    }
}

@Composable
fun DeviceFooter(data: DeviceData) {
    Column {
        Text(
            text = data.description,
            style = MaterialTheme.typography.bodyMedium,
        )

        var switchChecked by rememberSaveable { mutableStateOf(false) }
        Switch(
            checked = switchChecked,
            onCheckedChange = { switchChecked = it },
            modifier = Modifier.align(Alignment.CenterHorizontally),
        )
    }
}