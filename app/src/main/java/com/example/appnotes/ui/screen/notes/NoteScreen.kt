package com.example.appnotes.ui.screen.notes


import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.appnotes.ui.navigation.Screen
import java.util.*


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NoteScreen(navController: NavController, viewModel: NotesViewModel = viewModel()) {
    Log.i("22222", "NoteScreen")

    Scaffold(
        floatingActionButton = {
            FloatAction(navController = navController, imageVector = Icons.Default.Add, onClick = {
                navController.navigate(Screen.AddScreen.route)
            })
        },
        topBar = {

            TopAppBar(
                title = { Text("Notes") },
                actions = {
                    TopAppBarActionButton(imageVector = Icons.Default.List,
                        description = "fitter",
                        onClick = { viewModel.isShowDialogFitter.value = true })
                    TopAppBarActionButton(imageVector = Icons.Default.Face,
                        description = "profile",
                        onClick = { navController.navigate(Screen.ProfileScreen.route) })
                },
            )
        },
    ) {
        Body(navController, viewModel)
    }
}

@Composable
private fun Body(navController: NavController, viewModel: NotesViewModel) {
    val notes = viewModel.notes.observeAsState(listOf())

    //val
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp, bottom = 50.dp)
            .padding(16.dp)
    ) {
        ShowDialogComfirmDelete(viewModel)
        ShowDialogFitterNote(viewModel = viewModel)
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            this.items(notes.value.sortedWith(compareBy { it.timeNote }).filter {
                if (viewModel.dateFitter.value == 0) {
                    true
                } else {
                    val timeFitter = Calendar.getInstance()
                        .apply { add(Calendar.DATE, viewModel.dateFitter.value) }
                    val timeNote = Calendar.getInstance().apply { timeInMillis = it.timeNote }
                    timeNote.after(timeFitter)
                }

            }) { note ->
                NoteItem(note = note,
                    onDelete = { viewModel.openDialog(note) },
                    onClick = { navController.navigate(Screen.UpdateScreen.route + "/${note.id}") })

            }
        }

    }
}

@Composable
fun TopAppBarActionButton(
    imageVector: ImageVector, description: String, onClick: () -> Unit
) {
    IconButton(onClick = {
        onClick()
    }) {
        Icon(imageVector = imageVector, contentDescription = description)
    }
}

@Composable
fun FloatAction(navController: NavController, imageVector: ImageVector, onClick: () -> Unit) {
    FloatingActionButton(onClick = { onClick() }) {
        Icon(imageVector = imageVector, contentDescription = "Add note")
    }
}

@Composable
fun ShowDialogComfirmDelete(viewModel: NotesViewModel) {
    val isShow = viewModel.isShow.observeAsState()
    if (isShow.value == true) AlertDialog(onDismissRequest = { }, confirmButton = {
        TextButton(onClick = { viewModel.deleteNote() }) { Text(text = "Confirm") }
    }, dismissButton = {
        TextButton(onClick = { viewModel.closeDialog() }) { Text(text = "Cancel") }
    }, title = { Text(text = "Please confirm") }, text = { Text(text = "Delete note?") })
}

@Composable
fun ShowDialogFitterNote(viewModel: NotesViewModel) {
    val fillter = viewModel.getfitter()
    val isShow = viewModel.isShowDialogFitter.observeAsState()
    if (isShow.value == true) Dialog(onDismissRequest = { }, content = {
        Surface(
            shape = RoundedCornerShape(16.dp), color = Color.White
        ) {
            Box(contentAlignment = Alignment.Center) {
                IconButton(
                    onClick = { viewModel.isShowDialogFitter.value = false },
                    modifier = Modifier.align(Alignment.TopEnd)
                ) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "")
                }
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                        .padding(top = 20.dp)
                ) {

                    Text(fillter[0], modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            viewModel.fitter(0)
                            viewModel.isShowDialogFitter.value = false
                        })
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(fillter[1], modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            viewModel.fitter(1)
                            viewModel.isShowDialogFitter.value = false
                        })
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(fillter[2], modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            viewModel.fitter(2)
                            viewModel.isShowDialogFitter.value = false
                        })
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(fillter[3], modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            viewModel.fitter(3)
                            viewModel.isShowDialogFitter.value = false
                        })
                }
            }
        }
    })
}


