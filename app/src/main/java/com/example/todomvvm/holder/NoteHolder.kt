package com.example.todomvvm.holder

import com.example.todomvvm.databinding.ItemNoteBinding
import com.example.todomvvm.entities.NoteItem

class NoteHolder(private val binding: ItemNoteBinding) : BaseViewHolder<NoteItem>(binding) {
    override fun bind(item: NoteItem) {
        binding.note = item
    }
}