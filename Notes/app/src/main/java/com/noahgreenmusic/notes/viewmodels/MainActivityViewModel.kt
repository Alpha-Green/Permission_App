package com.noahgreenmusic.notes.viewmodels

import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.room.Room
import com.noahgreenmusic.notes.models.Note
import com.noahgreenmusic.notes.models.NoteDatabase

class MainActivityViewModel: ViewModel() {
   private lateinit var database: NoteDatabase
   val notesLiveData = MutableLiveData<List<Note>>()

    init {database = Room.databaseBuilder(applicationContext,
        NoteDatabase::class.java, "notes_database").allowMainThreadQueries().build()}
}

fun getNotes(database: NoteDatabase){
    notesLiveData.postValue(database.noteDao().getAllNotes())
}
fun addNotes(database: NoteDatabase, note:Note){
    database.noteDao().addNote()
    getNotes(database)
}