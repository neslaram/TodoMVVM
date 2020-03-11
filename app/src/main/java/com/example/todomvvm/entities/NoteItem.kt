package com.example.todomvvm.entities

import com.example.todomvvm.R
import com.example.todomvvm.adapter.TypesFactory
import java.io.Serializable

data class NoteItem(val title: String, val description: String) : BaseDataItem(),
    Serializable {
    override fun type(typesFactory: TypesFactory) = R.layout.item_note
}