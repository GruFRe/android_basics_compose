// No import needed when files are in the same directory ;p

fun test() {
    println("Hello other Function")
}
fun showFavoriteActor() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor)
    /*
    * Can reassign value to null because of type mismatch
    * Use a QuestionMark at the end of the type definition
    * */
    favoriteActor = null
    println(favoriteActor)
}
fun nullableInteger() {
    var number: Int? = 10
    println(number)
    number = null
    println(number)
}
fun handleNullableVariable() {
    var favoriteActor: String? = null
    // Safe Access of nullable variable methods with Safe Call Operator
    println(favoriteActor?.length)
    // Acces Value with not-null Assertion Operator, can cause Runtime errors if variable is null
//    println(favoriteActor!!.length)
}
fun handleNullabilityWithIfCondition() {
    var favoriteActor: String? = null

    val lenghtOfName = if (favoriteActor != null) {
        favoriteActor.length
    } else {
        0
    }
    println(lenghtOfName)
}
fun elvisOperator() {
    var favoriteActor: String? = null

    // Elvis Operator delivers default valur if variable is null
    var lengthOfName = favoriteActor?.length ?: 0

    println("The number of charachters in yout favotire actor's name is $lengthOfName")
}