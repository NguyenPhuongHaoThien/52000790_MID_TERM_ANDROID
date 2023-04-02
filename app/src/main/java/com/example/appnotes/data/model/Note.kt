package com.example.appnotes.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "note")//room android
data class Note(var titleNote: String, var contentNote: String, var timeNote: Long) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
