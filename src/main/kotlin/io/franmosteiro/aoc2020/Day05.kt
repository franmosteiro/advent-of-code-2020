package io.franmosteiro.aoc2020

/**
 * Advent of Code 2020 - Day 5: Binary Boarding -
 * Problem Description: http://adventofcode.com/2020/day/5
 */
class Day05(input: List<String>) {

    val seatsList = input

    private fun parseSeatsList(): List<Int> {

        var row: Int
        var column: Int

        return seatsList.map { seat ->
            val translatedSeats = seat
                    .replace("[FL]".toRegex(), "0")
                    .replace("[BR]".toRegex(), "1")

            row = translatedSeats.take(7).toInt(2)
            column = translatedSeats.takeLast(3).toInt(2)

            row * 8 + column
        }

    }

    fun resolvePartOne(): Int = parseSeatsList().maxOrNull() ?: 0

    fun resolvePartTwo(): Int {
        throw IllegalStateException("No matches found")
    }



}

