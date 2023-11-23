package com.sandymist.hellodagger

import android.app.Application
import com.sandymist.hellodagger.di.AppComponent
import com.sandymist.hellodagger.di.DaggerAppComponent
import javax.inject.Inject

class HelloDaggerApplication: Application() {
    lateinit var appComponent: AppComponent

    @Inject
    lateinit var calculator: Calculator

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.create()
        appComponent.inject(this)
        println("++++ CALC: " + calculator.calculate(299, 31))
    }
}