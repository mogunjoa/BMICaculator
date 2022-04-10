package com.example.bmicaculator

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.bmicaculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initEvent()
    }

    private fun validateCheck(): Boolean {

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

    fun getValue(editText: EditText) : Int = editText.text.toString().toInt()

    private fun initEvent() {
        binding.btnCaculate.setOnClickListener {
            if(validateCheck()) {
                startActivity(
                    Intent(this, BmiResultActivity::class.java).run {
                    putExtra("height", getValue(binding.etHeight))
                    putExtra("weight", getValue(binding.etWeight))
                })
            }
        }
    }
}