package com.example.bmicaculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.bmicaculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initEvent()
    }

    fun validateCheck(): Boolean {

        if (binding.etHeight.text.isEmpty()) {
            Toast.makeText(this, "신장을 입력해주세요.", Toast.LENGTH_SHORT).show()
            return false
        }

        if (binding.etWeight.text.isEmpty()) {
            Toast.makeText(this, "체중을 입력해주세요.", Toast.LENGTH_SHORT).show()
            return false
        }

        return true
    }

    fun valueSet() {

    }

    fun initEvent() {
        binding.btnCaculate.setOnClickListener {
            if(validateCheck()) {

            }
        }
    }
}