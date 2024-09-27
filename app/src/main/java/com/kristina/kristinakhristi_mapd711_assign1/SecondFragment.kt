package com.kristina.kristinakhristi_mapd711_assign1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
        val textStart = view?.findViewById<TextView>(R.id.txtCreate)
        textStart?.text = "onCreate() invoked"
    }

    override fun onStart() {
        super.onStart()
        val textStart = view?.findViewById<TextView>(R.id.txtStart)
        textStart?.text = "onStart() invoked"
    }

    override fun onResume() {
        super.onResume()
        val textResume = view?.findViewById<TextView>(R.id.txtResume)
        textResume?.text = "onResume() invoked"
    }

    override fun onPause() {
        super.onPause()
        val textResume = view?.findViewById<TextView>(R.id.txtPause)
        textResume?.text = "onPause() invoked"
    }

}