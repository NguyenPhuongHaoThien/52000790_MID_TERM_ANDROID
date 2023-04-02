package com.example.appnotes.ui.screen.notes


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.appnotes.data.model.Note
import com.example.appnotes.ui.theme.Purple40

import com.example.appnotes.utils.coverToTime

@Composable
fun NoteItem(note: Note, onDelete: () -> Unit, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .background(Purple40)
            .padding(10.dp)
            .clickable(onClick = onClick)
    ) {
        Column(

            modifier = Modifier.fillMaxSize(),

            ) {
            Text(

                text = note.titleNote,
                style = MaterialTheme.typography.titleLarge,
                color = Color.White,
                maxLines = 1,
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = note.contentNote,
                style = MaterialTheme.typography.labelSmall,
                color = Color.White,
                maxLines = 3,
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = note.timeNote.coverToTime(),
                style = MaterialTheme.typography.labelSmall,
                color = Color.White,
                maxLines = 3,
            )
        }
        IconButton(onClick = onDelete, modifier = Modifier.align(Alignment.CenterEnd)) {
            Icon(
                imageVector = Icons.Default.Delete,
                contentDescription = "delete",
                tint = Color.White
            )
        }

    }

}