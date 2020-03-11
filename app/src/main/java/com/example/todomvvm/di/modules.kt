package com.example.todomvvm.di

import com.example.todomvvm.adapter.BaseAdapter
import com.example.todomvvm.adapter.TypesFactoryImpl
import com.example.todomvvm.view.add.AddNewNoteViewModel
import com.example.todomvvm.view.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val applicationModule = module {
    viewModel { MainViewModel() }
    viewModel { AddNewNoteViewModel() }
    factory { BaseAdapter(typeFactory = get()) }
    factory { TypesFactoryImpl() }
//    single { Room.databaseBuilder(androidApplication(), AppDatabase::class.java, "app-db").build() }

}