package com.carlos.ctools

import org.junit.Test

/**
 * Created by Carlos on 2020/6/7.
 */
class PathTest {

    @Test
    fun test() {
        var url = javaClass.getResource("")
        println(url)
        url = javaClass.classLoader.getResource("")
        println(url)
    }
}