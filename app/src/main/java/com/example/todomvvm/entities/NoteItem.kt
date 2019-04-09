package com.example.todomvvm.entities

import com.example.todomvvm.R
import com.example.todomvvm.adapter.TypesFactory

data class NoteItem(val title: String = "title", val description: String = "description") : BaseDataItem() {
    override fun type(typesFactory: TypesFactory) = R.layout.item_note
}