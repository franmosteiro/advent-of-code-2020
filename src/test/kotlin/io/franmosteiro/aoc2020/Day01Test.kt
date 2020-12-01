package io.franmosteiro.aoc2020

import io.franmosteiro.aoc2020.utils.Resources
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@DisplayName("Day 1")
class Day01Test {

    //Given
    val inputs = listOf(1721, 979, 366, 299, 675, 1456)

    @Nested
    @DisplayName("Part One")
    inner class Part1 {
        @Test
        fun `Test example input (1721, 979, 366, 299, 675, 1456)`() {
            // When
            val answer = Day01(inputs).resolvePartOne()

            // Then
            assertThat(answer).isEqualTo(514579)
        }

        @Test
        fun `Test input file Day01in`() {
            // When
            val answer = Day01(Resources.resourceAsList("Day01.in")).resolvePartOne()

            // Then
            assertThat(answer).isEqualTo(542619)
        }
    }

    @Nested
    @DisplayName("Part Two")
    inner class Part2 {
        @Test
        fun `Test example input (1721, 979, 366, 299, 675, 1456)`() {
            // When
            val answer = Day01(inputs).resolvePartTwo()

            // Then
            assertThat(answer).isEqualTo(241861950)
        }

        @Test
        fun `Test input file Day01in`() {
            // When
            val answer = Day01(Resources.resourceAsList("Day01.in")).resolvePartTwo()

            // Then
            assertThat(answer).isEqualTo(32858450)
        }
    }
}