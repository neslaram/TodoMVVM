package com.example.todomvvm.utils

interface BindableAdapter<T> {
    fun setData(data: List<T>)
}