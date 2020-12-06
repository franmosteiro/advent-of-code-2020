package io.franmosteiro.aoc2020

import io.franmosteiro.aoc2020.utils.Resources
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

/**
 * Advent of Code 2020 - Day 5: Binary Boarding -
 * Problem Description: http://adventofcode.com/2020/day/5
 */
@DisplayName("Day 5")
class Day05Test {

    @Nested
    @DisplayName("Part One")
    inner class Part1 {
        @Test
        fun `Test example list`() {

            // Given
            val list = Resources.resourceAsList("testFile05.in")

            // When
            val answer = Day05(list).resolvePartOne()

            // Then
            //assertThat(answer).isEqualTo(2)
        }

        @Test
        fun `Test input file Day05in`() {
            // When
            val answer = Day02(Resources.resourceAsList("Day05.in")).resolvePartOne()

            // Then
            //assertThat(answer).isEqualTo(396)
        }
    }

    @Nested
    @DisplayName("Part Two")
    inner class Part2 {
        @Test
        fun `Test example input`() {

            // Given
            val list = Resources.resourceAsList("testFile05.in")

            // When
            val answer = Day05(list).resolvePartTwo()

            // Then
            //assertThat(answer).isEqualTo(1)
        }

        @Test
        fun `Test input file Day02in`() {
            // When
            val answer = Day05(Resources.resourceAsList("Day05.in")).resolvePartTwo()

            // Then
            //assertThat(answer).isEqualTo(428)
        }
    }
}