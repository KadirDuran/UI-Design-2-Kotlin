package com.example.ui_design_2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ui_design_2.databinding.ActivityGetstartedBinding

class GetStartedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGetstartedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetstartedBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnGetStarted.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}