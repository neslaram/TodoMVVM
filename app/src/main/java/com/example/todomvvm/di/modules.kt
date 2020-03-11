package com.example.todomvvm.di

import com.example.todomvvm.adapter.BaseAdapter
import com.example.todomvvm.adapter.TypesFactoryImpl
import org.koin.dsl.module

val applicationModule = module {
    factory { BaseAdapter(get()) }
    factory { TypesFactoryImpl() }
//    single { Room.databaseBuilder(androidApplication(), AppDatabase::class.java, "app-db").build() }

}
