package com.example.todomvvm.view.add

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel;
import com.example.todomvvm.entities.NoteItem
import com.example.todomvvm.utils.Event

class AddNewNoteViewModel : ViewModel() {
    val title = MutableLiveData<String>()
    val description = MutableLiveData<String>()

    private val _saveNoteEvent = MutableLiveData<Event<NoteItem>>()
    val saveNoteEvent: LiveData<Event<NoteItem>>
        get() = _saveNoteEvent

    fun saveNote() {
        val title = title.value.orEmpty()
        val description = description.value.orEmpty()

        _saveNoteEvent.value = Event(NoteItem(title, description))
    }
}
