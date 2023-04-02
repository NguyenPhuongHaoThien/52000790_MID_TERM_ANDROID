package com.example.appnotes.ui.screen.updateNote

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.appnotes.ui.screen.notes.FloatAction


//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun UpdateNoteScreen(navController: NavController, viewmodel: UpdateNoteViewmodel = viewModel()) {

    Scaffold(floatingActionButton = {
        FloatAction(navController = navController, imageVector = Icons.Default.Done, onClick = {
            viewmodel.update()
            navController.popBackStack()
        })
    }, topBar = {
        TopBar(navController, title = "Update Note")
    }) {
        Body(viewmodel)
    }
}

@Composable
private fun Body(viewmodel: UpdateNoteViewmodel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp)
            .padding(16.dp)
    ) {
        OutlinedTextField(
            value = viewmodel.titleCurrentNote.value,
            onValueChange = { viewmodel.titleCurrentNote.value = it },
            label = { Text("Title") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = viewmodel.contentCurrentNote.value,
            onValueChange = { viewmodel.contentCurrentNote.value = it },
            label = { Text("Content") },
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 50.dp)
        )

    }
}

@Composable
fun TopBar(navController: NavController, title: String) {
    TopAppBar(navigationIcon = {
        IconButton(onClick = {
            navController.popBackStack()
        }) {
            Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Go Back")
        }
    }, title = {
        Text(title)
    })
}
