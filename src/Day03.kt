fun main() {

    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day03_test")
    check(part1(testInput) == 150)

    val input = readInput("Day03")
    println("Part 1:" + part1(input))
    println("Part 1:" + part2(input))
}
