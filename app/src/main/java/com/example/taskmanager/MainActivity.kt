package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TasksCompleted("All tasks completed", "Nice work!")
                }
            }
        }
    }
}

@Composable
fun TasksCompleted(title: String, subtitle: String) {
    val checkImage = painterResource(id = R.drawable.ic_task_completed)
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Image(painter = checkImage, contentDescription = null)
        Title(title = title)
        Subtitle(subtitle = subtitle)
    }
}

@Composable
fun Title(title: String) {
    Text(text = title, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 24.dp, bottom = 8.dp))
}

@Composable
fun Subtitle(subtitle: String) {
    Text(text = subtitle, fontSize = 16.sp)
}

@Preview(showBackground = true)
@Composable
fun TasksCompletedPreview() {
    TaskManagerTheme {
        TasksCompleted("All tasks completed", "Nice work!")
    }
}