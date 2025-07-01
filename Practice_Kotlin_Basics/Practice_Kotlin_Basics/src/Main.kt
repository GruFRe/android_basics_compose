fun main() {
    println("Function with first exercise:")
    printMessages()
    fixCompileError()
    stringTemplates()
    stringConcatenation()
    messageFormatting()
    println(basicMathOperationsAdd(firstNumber = 10, secondNumber = 5))
    println(basicMathOperationsAdd(firstNumber = 10, secondNumber = 8))
    println(basicMathOperationsAdd())
    println(basicMathOperationsSub(firstNumber = 10, secondNumber = 5))
    println(basicMathOperationsSub(firstNumber = 10, secondNumber = 8))
    println(basicMathOperationsSub())
    println(basicMathOperationsMult(firstNumber = 10, secondNumber = 5))
    println(basicMathOperationsMult(firstNumber = 10, secondNumber = 8))
    println(basicMathOperationsMult())
    println(basicMathOperationsDiv(firstNumber = 10, secondNumber = 5))
    println(basicMathOperationsDiv(firstNumber = 10, secondNumber = 8))
    println(basicMathOperationsDiv())
    println(defaultParameters())
    println(defaultParameters(os = "Chrome OS", emailId = "your.account@gmail.com"))
    println("Time Comparison Function:")
    println(compareTime(today = 300, yesterday = 250))
    println(compareTime(today = 300, yesterday = 300))
    println(compareTime(today = 200, yesterday = 220))
    println(printCity(city = "Ankara", lowTemp = 27, highTemp = 31, chanceOfRain = 82))
    println(printCity(city = "Tokyo", lowTemp = 32, highTemp = 36, chanceOfRain = 10))
    println(printCity(city = "Cape Town", lowTemp = 59, highTemp = 64, chanceOfRain = 2))
    println(printCity(city = "Guatemala", lowTemp = 50, highTemp = 55, chanceOfRain = 7))
}

fun printMessages() {
    print("Use the val keyword when the value doesn't change. \n")
    print("Use the var keyword when the value can change.\n")
    print("When you define a function, you define the parameters that can be passed to it. \n")
    print("When you call a function, you pass arguments for the parameters.\n")
}
//wrong quote at the end of the string
fun fixCompileError() {
    println("New chat message from a friend")
}
// val cannot be reassigned, changed to var
fun stringTemplates() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage discount on $item! Hurry up!"
    println(offer)
}
//String Concatenation -> use Integers instead
fun stringConcatenation() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
fun messageFormatting() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "${baseSalary + bonusAmount}"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
fun basicMathOperationsAdd(
    firstNumber: Int = 20,
    secondNumber: Int = 22
): String {
    val result = firstNumber + secondNumber
    return "$firstNumber + $secondNumber = $result"
}
fun basicMathOperationsSub(
    firstNumber: Int = 20,
    secondNumber: Int = 15
): String {
    val result = firstNumber - secondNumber
    return "$firstNumber - $secondNumber = $result"
}
fun basicMathOperationsMult(
    firstNumber: Int = 20,
    secondNumber: Int = 15
): String {
    val result = firstNumber * secondNumber
    return "$firstNumber * $secondNumber = $result"
}
fun basicMathOperationsDiv(
    firstNumber: Int = 20,
    secondNumber: Int = 15
): String {
    val result = firstNumber / secondNumber
    return "$firstNumber / $secondNumber = $result"
}

fun defaultParameters(
    os: String = "Unknown operatingSystem",
    emailId: String = "sample@gmail.com"
): String {
    return "There's a sign-in request on $os for your Google Account $emailId."
}
//renamed with best practices of Kotlin Style Guide
fun pedometerstepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}

fun compareTime(yesterday: Int, today: Int): Boolean {
    return today > yesterday
}

fun printCity(city: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int): String {
    return "\nCity: $city\nLow temperature: $lowTemp, High temperature: $highTemp\nChance of rain: $chanceOfRain%\n"
}