package com.example.todomvvm.application

import android.app.Application
import com.example.todomvvm.di.applicationModule
import org.koin.android.ext.koin.androidContext

import org.koin.core.context.startKoin

class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            // declare used Android context
            androidContext(this@AppApplication)
            // declare modules
            modules(applicationModule)
        }
    }
}