fun main() {
    fun part1(input: List<Int>): Int {

        var prev = input[0]
        var timesIncreased = 0

        for(depth in input){

            if(prev < depth){
                timesIncreased++
            }

            prev = depth
        }

        return timesIncreased
    }

    fun part2(input: List<Int>): Int {

        var prev = input[0] + input[1] + input[2]
        var timesIncreased = 0

        fun three(index : Int) : Int = if(input.size < index + 3) 0 else input[index] + input[index + 1] + input[index +2]

        for(index in 0..input.size){

            val sum = three(index)

            if(prev < sum){
                timesIncreased++
            }
            prev = sum
        }

        return timesIncreased
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInputAsInt("Day01_test")
    check(part1(testInput) == 7)
    check(part2(testInput) == 5)

    val input = readInputAsInt("Day01")
    println("Part 1: " + part1(input))
    println("Part 2: " + part2(input))
}
