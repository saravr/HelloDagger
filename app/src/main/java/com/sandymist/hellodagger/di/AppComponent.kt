package com.sandymist.hellodagger.di

import android.content.Context
import com.sandymist.hellodagger.HelloDaggerApplication
import dagger.BindsInstance
import dagger.Component

@Component
interface AppComponent {
    fun inject(application: HelloDaggerApplication)

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun application(context: Context): Builder
    }
}