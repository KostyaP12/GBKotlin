package com.geekbrains.kotlinl1

object TestObj {
    fun copy(dayData: DayData)  : DayData  {
        val newDayData = dayData.copy()
        return newDayData
    }
}