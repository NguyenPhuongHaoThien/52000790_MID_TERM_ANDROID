package com.example.appnotes.ui.screen.addNote

import android.text.TextUtils
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appnotes.data.model.Note
import com.example.appnotes.utils.DataApi.noteDao
import kotlinx.coroutines.launch

class AddNoteViewmodel : ViewModel() {
    var title =  mutableStateOf("")
    var content= mutableStateOf("")
    fun addNote() {
        if (!TextUtils.isEmpty(title.value) && !TextUtils.isEmpty(content.value)) viewModelScope.launch {
            val note = Note(
                titleNote = title.value, contentNote = content.value, timeNote = System.currentTimeMillis()
            )
            noteDao.insertNote(note)
        }
    }
}