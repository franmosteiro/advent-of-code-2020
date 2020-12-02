package io.franmosteiro.aoc2020

/**
 * Advent of Code 2020 - Day 2: Password Philosophy -
 * Problem Description: http://adventofcode.com/2020/day/2
 */
class Day02(listOfPasswords: List<String>) {

    private val parsedOcurrences = listOfPasswords.map{
        val (ocurrences, keyChar, password) = it.split(" ")
        val (minOcur, maxOcur) = ocurrences.split("-").map { it.toInt() }
        Ocurrence(minOcur, maxOcur, keyChar.first(), password)
    }

    fun resolvePartOne(): Int {
        return parsedOcurrences.count{ (minOcur, maxOcur, keyChar, password) ->
            password.count { it == keyChar } in minOcur..maxOcur
        }
    }

    fun resolvePartTwo(): Int {
        throw IllegalStateException("No matches found")
    }

    private data class Ocurrence(val startPosition: Int, val endPosition: Int, val keyChar: Char, val password: String)
}

