fun main() {
    fun part1(input: List<String>): Int {

        var posX = 0
        var posY = 0

        for (instructions in input){

            val instruction = instructions.split(" ")

            val command = instruction[0]
            val value = instruction[1].toInt()

            when(command){
                "forward" -> posX += value
                "down" -> posY += value
                "up" -> posY -= value
            }
        }
        return posX * posY
    }

    fun part2(input: List<String>): Int {

        var posX = 0
        var posY = 0
        var aim = 0

        for (instructions in input){

            val instruction = instructions.split(" ")

            val command = instruction[0]
            val value = instruction[1].toInt()

            when(command){
                "forward" -> {
                    posX += value
                    posY += value * aim
                }
                "down" -> aim += value
                "up" -> aim -= value
            }
        }
        return posX * posY
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    check(part1(testInput) == 150)
    check(part2(testInput) == 900)

    val input = readInput("Day02")
    println("Part 1:" + part1(input))
    println("Part 2:" + part2(input))
}
