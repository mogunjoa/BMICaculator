package com.example.bmicaculator

import kotlin.math.pow

class BmiCaculate {
    fun bmiResult(bmi: Double): String {
        return when {
            bmi >= 35.0 -> "고도비만"
            bmi >= 30.0 -> "중정도 비만"
            bmi >= 25.0 -> "경도 비만"
            bmi >= 23.0 -> "과체중"
            bmi >= 18.5 -> "정상체중"
            else -> "저체중"
        }
    }

    fun bmiCalculate(height: Double, weight: Double): Double {
        return weight / (height / 100.0).pow(2.0)
    }
}