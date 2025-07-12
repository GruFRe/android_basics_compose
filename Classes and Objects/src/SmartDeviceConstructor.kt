// constructor keyword can be ommited if there is only one constructor in class
class SmartDeviceConstructor constructor(val name: String, val category: String) {
    var deviceStatus: String = "Online"
    // second constructor wich takes a statuscode
    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    fun turnOn() {
        println("Smart device turned on.")
        turnOff()
    }
    fun turnOff() {
        println("Smart device turned off.")
    }
}