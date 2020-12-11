package io.franmosteiro.aoc2020

/**
 * Advent of Code 2020 - Day 9: Encoding Error -
 * Problem Description: http://adventofcode.com/2020/day/9
 */
class Day09(input: List<String>) {

    private val seriesOfNumbers = input.map{ it.toLong() }
    private var invalidNumber = -1

    fun resolvePartOne(preambleBatchSize: Int = 5): Int = seriesOfNumbers.windowed(preambleBatchSize + 1, 1)
    .first { !it.isValid() }
    .last()
    .also { invalidNumber = it.toInt() }.toInt()

    fun resolvePartTwo(): Int = -1

    private fun List<Long>.isValid(): Boolean =
            any { itNumber -> ((last() - itNumber) in this) && (last() != itNumber) && ((last() - itNumber) != itNumber) }
}

