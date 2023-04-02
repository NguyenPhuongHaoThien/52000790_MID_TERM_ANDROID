package com.example.appnotes.ui.navigation

sealed class Screen(var route:String){
    object NotesScreen:Screen("notes_screen")
    object UpdateScreen:Screen("update_screen")
    object ProfileScreen:Screen("profile_screen")
    object AddScreen:Screen("add_screen")
}
