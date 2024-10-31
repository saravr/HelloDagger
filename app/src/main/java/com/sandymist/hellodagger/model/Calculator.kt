package com.sandymist.hellodagger.model

import javax.inject.Inject

class Calculator @Inject constructor(private val adder: Adder) {

    fun calculate(a: Int, b: Int) = adder.add(a, b)
}