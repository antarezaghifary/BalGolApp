package com.samrez.balgolapp.utils

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import io.reactivex.exceptions.UndeliverableException
import io.reactivex.plugins.RxJavaPlugins

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        RxJavaPlugins.setErrorHandler{ throwable : Throwable? -> }
        RxJavaPlugins.setErrorHandler{
            if(it is UndeliverableException){
                return@setErrorHandler
            }
        }
    }

    companion object {
        @SuppressLint("StaticFieldLeak")
        var instance: MyApp? = null
            private set

        @SuppressLint("StaticFieldLeak")
        var context: Context? = null
            get() = instance
    }
}