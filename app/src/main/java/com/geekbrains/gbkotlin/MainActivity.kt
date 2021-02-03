package com.geekbrains.gbkotlin


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geekbrains.kotlinl1.DayData
import com.geekbrains.kotlinl1.TestObj
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dayData = DayData("Hello", "Teacher");
        val a = dayData.toString()
        val newDayData = TestObj.copy(dayData = dayData)
        val b = newDayData.toString()
        cycle()

        btnTest.setOnClickListener {
            if (it.isClickable) {
                textView.text = b
            }

        }
    }

    private fun cycle() {
        val arr = Array<Int>(5) { 0 }
        arr[0] = 5
        arr[1] = 2
        arr[2] = 12
        arr[3] = 13
        arr[4] = 1
        for (value in arr) {
            when (value) {
                2 -> {
                    println("value = 2")
                }

                5 -> {
                    println("value = 5")
                }

                12 -> {
                    println("value = 12")
                }

                13 -> {
                    println("value = 13")
                }

                else -> {
                    println("     ")
                }
            }
        }
    }

}