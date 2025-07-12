class SmartDevice {

    val name = "Android TV"
    val category = "Entertainment"
    val deviceStatus = "online"

    var speakerVolume = 2
    /*  Setter function wich checks if value is in a specific range
        use the field variable to update the to avoid an endless loop
    * */
        set(value) {
            if (value in 1..100) {
                field = value
            }
        }

    fun turnOn() {
        println("Smart Device turned on.")
        // Call method inside class or other method inside of class
        turnOff()
    }
    fun turnOff() {
        println("Smart Device turned off.")
    }
}