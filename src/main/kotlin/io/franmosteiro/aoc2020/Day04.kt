package io.franmosteiro.aoc2020

/**
 * Advent of Code 2020 - Day 4: Passport Processing -
 * Problem Description: http://adventofcode.com/2020/day/4
 */
class Day04(input: String) {

    val passportStream = input

    fun resolvePartOne(): Int {

        val requiredFields = listOf("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid")

        val passports = passportStream.split("\\n\\n".toRegex()).map { line ->
            line.split("\\s".toRegex()).associate {
                val (field, value) = it.split(":")
                field to value
            }
        }

        return passports.count { passport -> requiredFields.all { it in passport } }
    }

    fun resolvePartTwo(): Long {
        throw IllegalStateException("No matches found")
    }

}

