package com.sandymist.hellodagger

import javax.inject.Inject

class Adder @Inject constructor() {
    fun add(a: Int, b: Int) = a + b
}