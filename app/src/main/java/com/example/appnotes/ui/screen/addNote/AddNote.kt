package com.example.appnotes.ui.screen.addNote

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.appnotes.ui.screen.notes.FloatAction
import com.example.appnotes.ui.screen.updateNote.TopBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AddNoteScreen(navController: NavController, viewmodel: AddNoteViewmodel = viewModel()) {
    Scaffold(

        floatingActionButton = {
            FloatAction(navController = navController, imageVector = Icons.Default.Done, onClick = {
                viewmodel.addNote()
                navController.popBackStack()
            })
        }, topBar = {
            TopBar(navController, title = "Add Note")
        }) {
        Body(navController, viewmodel)
    }
}

@Composable
private fun Body(navController: NavController, viewmodel: AddNoteViewmodel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp)
            .padding(16.dp)
    ) {
        OutlinedTextField(value = viewmodel.title.value,
            onValueChange = { viewmodel.title.value = it },
            label = { Text("Title") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = viewmodel.content.value,
            onValueChange = { viewmodel.content.value = it },
            label = { Text("Content") },
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 50.dp)
        )

    }
}
