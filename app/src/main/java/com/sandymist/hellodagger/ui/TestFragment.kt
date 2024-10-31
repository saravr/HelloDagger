package com.sandymist.hellodagger.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.sandymist.hellodagger.R
import com.sandymist.hellodagger.model.Calculator
import javax.inject.Inject

class TestFragment: Fragment() {
    @Inject
    lateinit var calculator: Calculator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_test, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView = view.findViewById<TextView>(R.id.text_view)
        textView.text = calculator.calculate(29, 31).toString()
    }
}
