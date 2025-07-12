/*
* IS-A relationship
* */

class SmartLightDevice(deviceName: String, deviceCategory: String, deviceStatus: Int) :
    SmartDeviceInheritance(name = deviceName, category = deviceCategory, statusCode = deviceStatus) {

        override val deviceType = "Smart Light"

        private var brightnessLevel by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)
    fun increaseBrightnessLevel() {
        brightnessLevel++
        println("Brightness level increased to $brightnessLevel")
    }
    fun decreaseBrightness() {
        brightnessLevel--
        println("Brightness level decreased to $brightnessLevel")
    }
    // use override keyword to give more change behaviour in subclass
    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart light turned off")
    }
}