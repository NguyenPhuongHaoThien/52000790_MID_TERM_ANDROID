package com.example.appnotes.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.appnotes.data.model.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun notedao(): NoteDao
}