package io.franmosteiro.aoc2020

import java.awt.Point

/**
 * Advent of Code 2020 - Day 3: Toboggan Trajectory -
 * Problem Description: http://adventofcode.com/2020/day/3
 */
class Day03(list: List<String>) {

    val listOfPoints = list

    fun resolvePartOne(): Int {
        return locateTrees(listOfPoints, Point(3,1))
    }

    fun resolvePartTwo(): Int {
        throw IllegalStateException("No matches found")
    }

    private fun locateTrees(listOfPoints: List<String>, slope: Point): Int {
        val currentLocation = Point(0, 0)
        var locatedTrees = 0

        while (currentLocation.y < listOfPoints.size) {
            if (listOfPoints[currentLocation.y][currentLocation.x] == '#') {
                locatedTrees++
            }
            val currentY = listOfPoints[currentLocation.y].length
            currentLocation.x = (currentLocation.x + slope.x) % currentY
            currentLocation.y += slope.y
        }

        return locatedTrees
    }
}

