// use open Keyword to make class reusable
// visibility modifier for constructor after class name
open class SmartDeviceInheritance protected constructor(val name: String, val category: String) {
    internal var deviceStatus: String = "Online"

    open val deviceType = "unknown"

    // second constructor wich takes a statuscode
    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
         deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
    // use open keyword again to amke functions overrideable
    open fun turnOn() {
        deviceStatus = "on"
    }
    open fun turnOff() {
        deviceStatus = "off"
    }
    fun printDeviceInfo() {
        println("Device name: $name, category: $category, type: $deviceType")
    }

}