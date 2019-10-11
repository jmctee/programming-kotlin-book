fun main(args: Array<String>) {
    // println(Runtime.getRuntime().availableProcessors())

    // println(canVote("Joe", 55))

//    println(max(1, 5, 2, 12, 7, 3))

//    val values = intArrayOf(1, 21, 3)

//    println(max(*values))

//    println(max(*listOf(1, 4, 18, 12).toIntArray()))

//    val stringRange: ClosedRange<String> = "aa".."zz"
//
//    var count = 0
//
//    for (string in stringRange) {
//        count++
//    }
//
//    println("$count")

    fizzBuzz(16)
}

//operator fun ClosedRange<String>.iterator() = object: Iterator<String> {
//    private val next = StringBuilder(start)
//    private val last = endInclusive
//    override fun hasNext() =
//        last >= next.toString() && last.length >= next.length
//    override fun next(): String { val result = next.toString()
//        val lastCharacter = next.last()
//        if (lastCharacter < Char.MAX_VALUE) { next.setCharAt(next.length - 1, lastCharacter + 1)
//        } else { next.append(Char.MIN_VALUE)
//        }
//        return result }
//}

fun canVote(name: String, age: Int): String {

//    val status = if (age > 17) {
//        "yes, please vote"
//    }
//    else {
//        "nope, please come back"
//    }

    val status = if (age > 17) "yes, please vote" else "nope, please come back"

//    var status: String
//    if (age > 17) {
//        status = "yes, please vote"
//    } else {
//        status = "nope, please come back"
//    }

    return "$name, $status"
}

// TODO: Rewrite without var
fun max(vararg numbers: Int): Int {
    var large = Int.MIN_VALUE

    for (number in numbers) {
        large = if (number > large) number else large
    }

    return large
}

/*
Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and
for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".
 */

fun fizzBuzz(iterationCount: Int) {
    for (ii in (-7..iterationCount)) {
        var result: String = ""

        val divisibleByThree = (ii.rem(3) == 0)
        val divisibleByFive = (ii.rem(5) == 0)
        val divisibleByThreeOrFive = divisibleByThree || divisibleByFive

        if (divisibleByThree) result += "Fizz"
        if (divisibleByFive) result += "Buzz"
        if (!divisibleByThreeOrFive) result += ii

        println(result)
    }
}