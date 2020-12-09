package io.franmosteiro.aoc2020

/**
 * Advent of Code 2020 - Day 8: Handheld Halting -
 * Problem Description: http://adventofcode.com/2020/day/8
 */
class Day08(input: List<String>) {

    private val orders: List<Order> = input.map {
        val (name, offset) = it.split("\\s".toRegex())
        Order(name, offset.toInt())
    }

    fun resolvePartOne(): Int = Program().run(orders)

    fun resolvePartTwo(): Int = -1

    data class Program(
            var position: Int = 0,
            var accumulator: Int = 0,
            var executedOrdersPositions: MutableSet<Int> = mutableSetOf()) {

        fun run(orders: List<Order>): Int {
            while (true) {

                if (position in executedOrdersPositions) {
                    return accumulator
                }

                executedOrdersPositions.add(position)

                val currentOrder = orders[position]

                when (currentOrder.name) {
                    "jmp" -> position += currentOrder.offset
                    "nop" -> position++
                    "acc" -> {
                        accumulator += currentOrder.offset
                        position++
                    }
                }
            }
        }
    }

    data class Order(
            val name: String,
            val offset: Int,
    )
}

