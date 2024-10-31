package com.sandymist.hellodagger.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sandymist.hellodagger.HelloDaggerApplication
import com.sandymist.hellodagger.R

class TestActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_test)

        val fragment = TestFragment()

        (application as HelloDaggerApplication).appComponent.inject(fragment)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}
