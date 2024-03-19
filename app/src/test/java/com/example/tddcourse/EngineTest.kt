package com.example.tddcourse

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class EngineTest {
    private val engine = Engine(2000,100,95,true)

    @Test
    fun engineTurnsOn() {
        engine.turnOn()
        assertEquals(true,engine.isTurnedOn)
        assertEquals(95,engine.temperature)
    }

    @Test
    fun engineTurnsOff() {
       engine.turnOff()
       assertEquals(false, engine.isTurnedOn)
       assertEquals(15, engine.temperature)
    }
}