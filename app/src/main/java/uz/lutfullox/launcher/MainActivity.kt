
package uz.lutfullox.launcher

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LauncherScreen()
        }
    }
}

@Composable
fun LauncherScreen() {
    val red = Color(0xFFE53935)

    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF101116))
                .padding(22.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                "LUTFULLOX",
                color = Color.White,
                fontSize = 34.sp
            )

            Text(
                "MOBILE ROLEPLAY",
                color = red,
                fontSize = 16.sp
            )

            Spacer(Modifier.height(35.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF202127)
                ),
                shape = RoundedCornerShape(20.dp)
            ) {
                Column(Modifier.padding(20.dp)) {
                    Text(
                        "LUTFULLOX ROLEPLAY",
                        color = Color.White,
                        fontSize = 22.sp
                    )

                    Spacer(Modifier.height(12.dp))

                    Text("SA-MP 0.3.7", color = Color.Gray)

                    Text(
                        "SERVER: NOT CHECKED",
                        color = Color.Yellow
                    )

                    Spacer(Modifier.height(20.dp))

                    Button(
                        onClick = {},
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = red
                        )
                    ) {
                        Text("PLAY", fontSize = 18.sp)
                    }
                }
            }

            Spacer(Modifier.height(25.dp))

            Text("NEWS  |  SETTINGS", color = Color.LightGray)

            Spacer(Modifier.height(40.dp))

            Text(
                "LUTFULLOX MOBILE © 2026",
                color = Color.Gray,
                fontSize = 12.sp
            )
        }
    }
}
