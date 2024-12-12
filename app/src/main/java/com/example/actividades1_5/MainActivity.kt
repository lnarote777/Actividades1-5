package com.example.actividades1_5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.actividades1_5.screens.Actividad1
import com.example.actividades1_5.screens.Actividad2
import com.example.actividades1_5.screens.Actividad3
import com.example.actividades1_5.screens.Actividad4
import com.example.actividades1_5.screens.VariablesAct5
import com.example.actividades1_5.ui.theme.Actividades15Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Actividades15Theme {
                Actividad1()
            }
        }
    }
}
