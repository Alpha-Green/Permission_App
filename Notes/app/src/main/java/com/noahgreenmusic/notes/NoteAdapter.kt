package com.noahgreenmusic.notes

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.noahgreenmusic.notes.databinding.ActivityMainBinding.inflate
import com.noahgreenmusic.notes.models.Note

class NoteAdapter (private val notes: List<Note>) : RecyclerView.Adapter<>() {

    class NoteViewHolder(private val binding: NoteItemBinding) : RecyclerView.ViewHolder(binding.)
    fun bindNote(note){
        binding.apply{this idDisplay.text = note.id.toString()
            titleDisplay.text = note.title
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        var binding = NoteItemBinding.inflate(layoutinflater.from(parent.context))
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {holder.bindNote(notes[position])

    }

    override fun getItemCount(): Int {

    }
}

class NoteItemBinding {

}
