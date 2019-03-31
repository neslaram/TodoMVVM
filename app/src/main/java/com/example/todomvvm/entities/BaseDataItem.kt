package com.example.todomvvm.entities

import com.example.todomvvm.adapter.TypesFactory

abstract class BaseDataItem {
    abstract fun type(typesFactory: TypesFactory): Int
}