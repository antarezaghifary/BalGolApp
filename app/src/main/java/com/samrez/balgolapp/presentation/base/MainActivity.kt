package com.samrez.balgolapp.presentation.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oratakashi.viewbinding.core.binding.activity.viewBinding
import com.samrez.balgolapp.R
import com.samrez.balgolapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}