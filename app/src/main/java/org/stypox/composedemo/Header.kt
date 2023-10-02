package org.stypox.composedemo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.stypox.composedemo.ui.theme.ComposeDemoTheme

@Composable
fun Header(iconPainter: Painter, name: String, address: String) {
    Column(
        Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            iconPainter,
            contentDescription = name,
            contentScale = ContentScale.Crop,
            modifier = Modifier.width(128.dp),
        )

        Text(
            text = name,
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center,
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = address,
            textAlign = TextAlign.Center,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPreviewSpeckTech() {
    ComposeDemoTheme {
        Header(
            iconPainter = painterResource(R.drawable.small_logo_alone),
            name = "Impact Hub",
            address = "Via Roberto da Sanseverino 95 - Trento",
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPreviewMyHome() {
    ComposeDemoTheme {
        Header(
            iconPainter = rememberVectorPainter(image = Icons.Default.Home),
            name = "My home",
            address = "Via Mazzini 24 - Trento",
        )
    }
}