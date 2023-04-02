package com.example.appnotes.utils

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.room.Room
import com.example.appnotes.data.room.NoteDao
import com.example.appnotes.data.room.NoteDatabase

object DataApi {
    lateinit var noteDao: NoteDao
    lateinit var sharedPref: SharedPreferences
    fun createNoteDao(application: Application) {
        val db = Room.databaseBuilder(application, NoteDatabase::class.java, "databse-note").build()
        noteDao = db.notedao()
        Log.i("22222", "createNoteDao")
    }

    fun createSharePref(application: Application) {
        sharedPref = application.getSharedPreferences("", Context.MODE_PRIVATE)
    }
}