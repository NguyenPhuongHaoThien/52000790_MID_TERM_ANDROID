package com.example.appnotes.ui.screen.updateNote

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appnotes.data.model.Note
import com.example.appnotes.utils.DataApi.noteDao
import kotlinx.coroutines.launch

class UpdateNoteViewmodel(savedStateHandle: SavedStateHandle) : ViewModel() {
    var titleCurrentNote = mutableStateOf("")
    var contentCurrentNote = mutableStateOf("")
    var timeCurrentNote = mutableStateOf(0L)
    private var idCurrentNote: Int? = null


    init {
        idCurrentNote = checkNotNull(savedStateHandle["id"])
        Log.i("22222", ": $idCurrentNote")
        idCurrentNote?.let {
            viewModelScope.launch {
                noteDao.getNote(it)?.also {
                    titleCurrentNote.value = (it.titleNote)
                    contentCurrentNote.value = (it.contentNote)
                }
            }
        }
    }

    fun update() {
        viewModelScope.launch {
            noteDao.insertNote(Note(
                titleNote = titleCurrentNote.value,
                contentNote = contentCurrentNote.value,
                timeNote = System.currentTimeMillis()
            ).apply {
                idCurrentNote?.let {
                    id = it
                }

            })
        }
    }


}