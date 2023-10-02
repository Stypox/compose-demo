package org.stypox.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import org.stypox.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        HomeInformationPanel(
                            iconPainter = painterResource(R.drawable.small_logo_alone),
                            name = "Impact Hub",
                            address = "Via Roberto da Sanseverino 95 - Trento",
                        )

                        Divider(modifier = Modifier.padding(horizontal = 16.dp))

                        Text(
                            modifier = Modifier.padding(16.dp),
                            text = "Available devices to configure",
                            style = MaterialTheme.typography.labelMedium,
                        )

                        Device()
                    }
                }
            }
        }
    }
}
