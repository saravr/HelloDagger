package com.sandymist.hellodagger

import android.app.Application
import com.sandymist.hellodagger.di.AppComponent
import com.sandymist.hellodagger.di.DaggerAppComponent
import javax.inject.Inject

class HelloDaggerApplication: Application() {
    private lateinit var appComponent: AppComponent

    // use case 1
    @Inject
    lateinit var calculator: Calculator

    // use case 2
    @Inject
    lateinit var packageHelper: PackageHelper

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .application(this)
            .build()
        appComponent.inject(this)

        println("++++ Use case 1: Calculator result: " + calculator.calculate(299, 31))

        println("++++ Use case 2: Package name: " + packageHelper.printPackageName())
    }
}