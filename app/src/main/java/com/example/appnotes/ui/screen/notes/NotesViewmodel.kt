package com.example.appnotes.ui.screen.notes


import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appnotes.data.model.Note
import com.example.appnotes.utils.DataApi.noteDao
import kotlinx.coroutines.launch

class NotesViewModel : ViewModel() {
    var notes: LiveData<List<Note>> = noteDao.getNotes()
    var isShow = MutableLiveData(false)
    var isShowDialogFitter = MutableLiveData(false)
    var note: Note? = null
    var fitter = listOf("None", "Today", "Since yesterday", "This week")
    var dateFitter = mutableStateOf(0)


    init {
        isShow = MutableLiveData(false)
        viewModelScope.launch {}
    }

    fun openDialog(note: Note) {
        isShow.value = true
        this.note = note
    }

    fun deleteNote() {
        note?.let { viewModelScope.launch { noteDao.deleteNote(it) } }
        closeDialog()
    }

    fun closeDialog() {
        isShow.value = false
    }

    fun getfitter(): List<String> {
        return fitter
    }

    fun fitter(indexFitter: Int) {
        when (indexFitter) {
            0 -> dateFitter.value = 0
            1 -> dateFitter.value = -1
            2 -> dateFitter.value = -2
            3 -> dateFitter.value = -7
            else -> dateFitter.value = 0
        }

    }
}