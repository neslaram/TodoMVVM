package com.example.todomvvm.view.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.todomvvm.entities.NoteItem

class MainViewModel : ViewModel() {

    private val _name = MutableLiveData<String>().apply { value = "PCI Screen" }
    private val _notes = MutableLiveData<List<NoteItem>>().apply { value = mutableListOf(NoteItem(), NoteItem()) }


    val tyron = MutableLiveData<Int>().apply { value = 100 }
    val name: LiveData<String> = _name // Expose the immutable version of the LiveData
    val notes: LiveData<List<NoteItem>> = _notes

}
