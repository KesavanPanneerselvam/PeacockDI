package com.kesavan.interview.peacockinterviewcode.di

import android.app.Application
import com.kesavan.interview.peocockdi.di.Injectors

class PeacockApp:Application() {
    override fun onCreate() {
        super.onCreate()
        Injectors.injectApp(AppModule::class)
    }
}