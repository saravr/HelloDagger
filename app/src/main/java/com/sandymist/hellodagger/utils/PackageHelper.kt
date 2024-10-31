package com.sandymist.hellodagger.utils

import android.content.Context
import javax.inject.Inject

class PackageHelper @Inject constructor(private val context: Context) {
    fun printPackageName(): String {
        return context.applicationContext.packageName
    }
}