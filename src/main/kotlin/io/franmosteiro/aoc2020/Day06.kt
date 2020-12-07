package io.franmosteiro.aoc2020

/**
 * Advent of Code 2020 - Day 6: Custom Customs -
 * Problem Description: http://adventofcode.com/2020/day/6
 */
class Day06(input: String) {

    private val answers = input.split("\\n\\n".toRegex())

    fun resolvePartOne(): Int = answers
            .sumBy { it.replace("\\n".toRegex(), "")
                    .toSet() // deletes duplicates
                    .size
            }

    fun resolvePartTwo(): Int {
        return 1
    }

}

