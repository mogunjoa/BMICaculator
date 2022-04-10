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

        val height = intent.getDoubleExtra("height", 0.0)
        val weight = intent.getDoubleExtra("weight", 0.0)

        binding.tvBmiResult.text = BmiCaculate().bmiResult(BmiCaculate().bmiCalculate(height, weight))
    }
}