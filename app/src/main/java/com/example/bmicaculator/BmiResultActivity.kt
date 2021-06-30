package com.example.bmicaculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.bmicaculator.databinding.ActivityBmiResultBinding
import kotlin.math.pow

class BmiResultActivity : AppCompatActivity() {

    lateinit var binding: ActivityBmiResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_bmi_result)

        initValue(binding.tvBmiResult)
    }

    fun initValue(textView: TextView) {
        textView.text = when {
            bmiCalculate() >= 35.0 -> "고도비만"
            bmiCalculate() >= 30.0 -> "중정도 비만"
            bmiCalculate() >= 25.0 -> "경도 비만"
            bmiCalculate() >= 23.0 -> "과체중"
            bmiCalculate() >= 18.5 -> "정상체중"
            else -> "저체중"
        }
    }

    fun bmiCalculate(): Double {
        val height = intent?.getIntExtra("height", 0)
        val weight = intent?.getIntExtra("weight", 0)

        return weight!! / (height!! / 100.0).pow(2.0)
    }
}