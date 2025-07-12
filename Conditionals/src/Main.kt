

fun main() {
    trafficLightColor("Red")
    trafficLightColor("green")
    trafficLightColor("yellow")
    trafficLightColor("something else")
    caseTrafficLightColor("Red")
    caseTrafficLightColor("Yellow")
    caseTrafficLightColor("Green")
    caseTrafficLightColor("Black")
    println(complexCaseStatement(3))
    println(complexCaseStatement(4))
    println(complexCaseStatementRefactored(3))
    println(complexCaseStatementRefactored(4))
    println(complexInCase(x = 3))
    println(complexInCase(x = 4))
    println(complexInCase(x = 11))
    println(complexIsCase(20))
    println(trafficLightColorFinal("Amber"))
    println(conditionIfAsExpression("Black"))
    println(conditionalWhenAsExpression("Blue"))
}
fun trafficLightColor(color: String) {
    if(color == "Red") {
        print("stop")
    }
    else if(color == "Yellow") {
        println("Slow")
    }
    else if(color == "Green") {
        println("Go")
    }
    else {
        println("$color is an invalid traffic light color, call service for help!")
    }
}
fun caseTrafficLightColor(color: String) {
    when(color) {
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("$color is invalid, please call the service hotline.")
    }
}
fun complexCaseStatement(x: Int): String {
    return when(x) {
        2 -> "x is a prime number between 1 and 10"
        3 -> "x is a prime number between 1 and 10"
        5 -> "x is a prime number between 1 and 10"
        7 -> "x is a prime number between 1 and 10"
        else -> "x is not a prime number between 1 and 10"
    }
}
fun complexCaseStatementRefactored(x: Int): String {
    return when(x) {
        // Multiple conditions in one line
        2,3,5,7 -> "x is a prime number between 1 and 10"
        else -> "x is not a prime number between 1 and 10"
    }
}
fun complexInCase(x: Int): String {
    return when(x) {
        2,3,5,7 -> "x is a prime number between one and ten"
        in 1..10 -> "x is a number between one and ten, but not a prime number."
        else -> "x isn't a prime number between one and ten"
    }
}
fun complexIsCase(x: Any): String {
    return when(x) {
        2,3,5,7 -> "x is a prime number between one and ten"
        in 1..10 -> "x is a number between one and ten, but not a prime number"
        is Int -> "x is a number but not between one and ten"
        else -> "x isn't a integer number"
    }
}
fun trafficLightColorFinal(lightColor: String): String {
    return when (lightColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "invalid traffic light color"
    }
}
fun conditionIfAsExpression(trafficLightColor: String): String {
    val message =
        if (trafficLightColor == "Red") "Stop"
        else if (trafficLightColor == "Yellow") "Slow"
        else if (trafficLightColor == "Green") "Go"
        else "Invalid traffic light color"
    return message
}
fun conditionalWhenAsExpression(trafficLightColor: String): String {
    val message = when (trafficLightColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid traffic light color"
    }
    return message
}