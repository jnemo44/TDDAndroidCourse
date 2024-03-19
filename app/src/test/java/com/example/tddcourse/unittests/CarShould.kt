package com.example.tddcourse.unittests

import com.example.tddcourse.ui.Car
import org.junit.Assert.assertEquals
import org.junit.Test

class CarShould {

    val car = Car(5.5)

    @Test
    fun loosingFuelWhenItTurnsOn() {
        car.turnOn()

        assertEquals(5.0,car.fuel, .001)
    }
}