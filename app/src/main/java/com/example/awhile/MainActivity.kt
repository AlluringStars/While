package com.example.ifwhen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                CycleTaskScreen()
            }
        }
    }
}

@Composable
fun CycleTaskScreen() {
    var sumResult by remember { mutableStateOf(0.0) }

    val myColor = Color(0xFF9C27B0) // Фиолетовый

    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { sumResult = 1.0 }, // Просто выводим 1.0
            colors = ButtonDefaults.buttonColors(containerColor = myColor)
        ) {
            Text("Вычислить", fontSize = 18.sp, color = Color.White)
        }
        Spacer(modifier = Modifier.height(24.dp))
        Text("Сумма: $sumResult", fontSize = 20.sp, color = myColor)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCycleTask() {
    MaterialTheme { CycleTaskScreen() }
}