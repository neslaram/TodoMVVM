package com.example.todomvvm.view.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.todomvvm.entities.NoteItem
import com.example.todomvvm.utils.Event

class MainViewModel : ViewModel() {

    private val _notes = MutableLiveData<MutableList<NoteItem>>().apply { value = mutableListOf() }
    val notes: LiveData<MutableList<NoteItem>> = _notes

    private val _addNoteEvent = MutableLiveData<Event<Any>>()
    val addNoteEvent: LiveData<Event<Any>>
        get() = _addNoteEvent

    fun addNewItem() {
//        val orEmpty = _notes.value.orEmpty() as MutableList<NoteItem>
//        orEmpty.add(NoteItem())
//        _notes.postValue(orEmpty)
    }

    /**
     * Called by the Data Binding library and the FAB's click listener.
     */
    fun addNewNote() {
        _addNoteEvent.value = Event(Unit)
    }
}
