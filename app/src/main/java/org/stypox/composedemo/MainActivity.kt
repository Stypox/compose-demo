package org.stypox.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import org.stypox.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            // include a drawer-like navigation icon just for demonstration
                            navigationIcon = {
                                IconButton(onClick = { /* ignore, just an example */ }) {
                                    Icon(
                                        imageVector = Icons.Default.Menu,
                                        contentDescription = "Home",
                                    )
                                }
                            },
                            title = {
                                Text(
                                    text = "Home devices assistant",
                                )
                            },
                        )
                    }
                ) { paddingValues ->
                    Column(
                        modifier = Modifier.padding(paddingValues)
                            .verticalScroll(rememberScrollState())
                    ) {
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

                        deviceDataList.forEach {
                            DevicePanel(data = it)
                        }
                    }
                }
            }
        }
    }
}
