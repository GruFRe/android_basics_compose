/*Naming Conventions apply to functions and variables
 - lower Camel Case

Style Guide
 - one space between input arguments and opening curly brace
 - one space between operators and their arguments
 - one space after Colon before type declaration
 - intendation of four spaces
 - align vertically

 */

fun main() {
    println("Hello, IntelliJ!")
    println("Hello, IntelliJ!")
    println("Today is sunny!")
    println()
    println("I'm")
    println("learning")
    println("Kotlin!")

    println("Tomorrow is rainy")

    // printLine("There is a chance of snow")
    println("There is a chance of snow")

    println("Cloudy")
    println("Partly Cloudy")
    println("Windy")
    println()
    println("Variables:")
    var count: Int = 10

    println(count)
    //String template
    println("You have $count unread messages.")

    val unreadCount = 5
    val readCount = 100
    println("You have ${unreadCount + readCount} total messages in your box.")
    count++
    print("COunt: $count")
    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")

    //String concatenation
    val nextMeeting = "Next meeting: "
    val date = "January 1"
    val reminder = nextMeeting + date + " at work"
    println(reminder)
    println("Say \"Hello\"")

}




