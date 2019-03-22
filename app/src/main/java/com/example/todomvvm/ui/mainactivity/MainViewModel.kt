package com.example.todomvvm.ui.mainactivity

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val password: ObservableField<String> = ObservableField("asddsa")
}
