package com.example.appnotes.ui.screen.profile.ProfileScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.appnotes.ui.screen.notes.FloatAction
import com.example.appnotes.ui.screen.updateNote.TopBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ProfileScreen(navController: NavController, viewmodel: ProfileViewModel = viewModel()) {
    Scaffold(topBar = { TopBar(navController = navController, title = "Profile") },
        floatingActionButton = {
            FloatAction(navController = navController, imageVector = Icons.Default.Done, onClick = {
                viewmodel.save()
                navController.popBackStack()
            })
        }) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 50.dp)
                .padding(16.dp)
        ) {
            Info("Email:", viewmodel.email)
            Spacer(modifier = Modifier.height(20.dp))
            Info("Number Phone", viewmodel.phone)
        }
    }
}

@Composable
fun Info(title: String, content: MutableState<String>) {
    TextField(value = content.value,
        onValueChange = { content.value = it },
        label = { Text(title) },
        modifier = Modifier.fillMaxWidth(),
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color.Blue,
            disabledTextColor = Color.Black,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        )
    )
}