package com.sandymist.hellodagger.di

import com.sandymist.hellodagger.HelloDaggerApplication
import dagger.Component

@Component
interface AppComponent {
    fun inject(application: HelloDaggerApplication)
}