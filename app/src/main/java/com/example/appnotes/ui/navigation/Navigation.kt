package com.example.appnotes.ui.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.appnotes.ui.screen.addNote.AddNoteScreen
import com.example.appnotes.ui.screen.notes.NoteScreen
import com.example.appnotes.ui.screen.profile.ProfileScreen.ProfileScreen
import com.example.appnotes.ui.screen.updateNote.UpdateNoteScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    Log.i("22222", "Navigation: ")

    NavHost(navController = navController, startDestination = Screen.NotesScreen.route) {
        composable(Screen.NotesScreen.route) {
            NoteScreen(navController = navController)
        }
        composable(
            Screen.UpdateScreen.route + "/{id}",
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) {
            UpdateNoteScreen(navController = navController)
        }
        composable(Screen.ProfileScreen.route) {
            ProfileScreen(navController)
        }
        composable(Screen.AddScreen.route) {
            AddNoteScreen(navController = navController)
        }

    }
}
