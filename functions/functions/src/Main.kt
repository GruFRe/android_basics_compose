fun main() {
    println(birthdayGreeting())
    val greeting = birthdayGreeting(name = "Bob", age = 99)
    println(greeting)
}
// <keyword> <name>(<parameter>, <parameter>, ....): <Return Value> {<function body>}
fun birthdayGreeting(name: String = "Rover", age: Int = 5): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}