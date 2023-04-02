package com.example.appnotes

import android.app.Application
import com.example.appnotes.utils.DataApi

class NoteApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        DataApi.createNoteDao(this)
        DataApi.createSharePref(this)
    }
}