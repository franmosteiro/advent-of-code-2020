package io.franmosteiro.aoc2020.utils

import java.io.File
import java.net.URI

internal object Resources {

    fun resourceAsList(fileName: String): List<Int> =
            File(fileName.toURI()).readLines().map { it.toInt() }

    private fun String.toURI(): URI =
            Resources.javaClass.classLoader.getResource(this)?.toURI() ?: throw IllegalArgumentException("Cannot find Resource: $this")

}