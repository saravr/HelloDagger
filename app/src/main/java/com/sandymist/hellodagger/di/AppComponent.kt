package com.sandymist.hellodagger.di

import android.content.Context
import com.sandymist.hellodagger.HelloDaggerApplication
import com.sandymist.hellodagger.ui.TestFragment
import dagger.BindsInstance
import dagger.Component

@Component
interface AppComponent {
    fun inject(application: HelloDaggerApplication)
    fun inject(testFragment: TestFragment)

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun application(context: Context): Builder
    }
}
