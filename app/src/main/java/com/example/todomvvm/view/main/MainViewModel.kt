package com.example.todomvvm.view.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.todomvvm.entities.NoteItem

class MainViewModel : ViewModel() {

    private val _notes = MutableLiveData<MutableList<NoteItem>>().apply { value = mutableListOf() }
    val notes: LiveData<MutableList<NoteItem>> = _notes

    fun addNewItem() {
        val orEmpty = _notes.value.orEmpty() as MutableList<NoteItem>
        orEmpty.add(NoteItem())
        _notes.postValue(orEmpty)
    }
}
