package com.example.assignment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.assignment.databinding.ActivityScreen2Binding

class Screen2 : AppCompatActivity() {
    private lateinit var binding: ActivityScreen2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScreen2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idWeb.setOnClickListener {

            val intent = Intent(this, Web::class.java)
            startActivity(intent)
        }
        binding.idAndroidDevelopment.setOnClickListener {

            val intent = Intent(this, AndroidDevelopment::class.java)
            startActivity(intent)
        }

        binding.idCloudComputing.setOnClickListener {

            val intent = Intent(this, CloudComputing::class.java)
            startActivity(intent)
        }

        binding.idMachineLearning.setOnClickListener {

            val intent = Intent(this, MachineLearning::class.java)
            startActivity(intent)
        }
        binding.idReact.setOnClickListener {

            val intent = Intent(this, React::class.java)
            startActivity(intent)
        }

        binding.idPython.setOnClickListener {

            val intent = Intent(this, Python::class.java)
            startActivity(intent)
        }
        binding.CallBtn.setOnClickListener {

            val callIntent = Intent(Intent.ACTION_CALL)
            callIntent.data = Uri.parse("tel:"+917521848407);
            startActivity(callIntent)
        }
    }
}