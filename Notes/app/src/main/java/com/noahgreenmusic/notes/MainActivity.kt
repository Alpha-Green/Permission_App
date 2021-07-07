package com.noahgreenmusic.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.noahgreenmusic.notes.databinding.ActivityMainBinding
import com.noahgreenmusic.notes.models.Note
import com.noahgreenmusic.notes.models.NoteDatabase
import com.noahgreenmusic.notes.viewmodels.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var database: NoteDatabase
    private lateinit var noteAdapter: NoteAdapter
    private lateinit var viewmodel: MainActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        database = Room.databaseBuilder(
            applicationContext, NoteDatabase::class.java, "notes_database")
            .allowMainThreadQueries().build()

       viewmodel = viewModelProvider(this)

        NoteAdapter = NoteAdapter( this, database.noteDao().getAllNotes())
        binding.rvNoteHandling.apply {
            layoutManager = LinearLayoutManager(
                this@MainActivity
            )
            adapter = noteAdapter

        }  binding.btnSave.setOnClickListener {
            val title = binding.titleInput.text.toString()
            val content = binding.contentInput.text.toString()

            saveNote(title, content)
        }

    }
    private fun saveNote(title:String, content: String){
        val note = Note (id = 0, title, content)
        database.noteDao().addNote(note)
        noteAdapter.notifyDataSetChanged()
    }
}