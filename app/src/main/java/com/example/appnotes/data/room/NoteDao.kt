package com.example.appnotes.data.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.appnotes.data.model.Note

@Dao
interface NoteDao {
    @Query("select * from note")
    fun getNotes(): LiveData<List<Note>>

    @Query("select * from note where id=:id")
    suspend fun getNote(id: Int): Note?

    @Update
    suspend fun updateNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)
}