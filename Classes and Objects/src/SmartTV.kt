import kotlin.inc
/*
* IS-A relationship
* */
class SmartTV(deviceName: String, deviceCategory: String, deviceStatus: Int) :
    SmartDeviceInheritance(name = deviceName, category =  deviceCategory, statusCode = deviceStatus){
    override val deviceType = "Smart TV"

    // Next two functions are private because they should only be controlled by functions inside the class
    private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)
    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume")
    }
    fun decreaseSpeakerVolume() {
        speakerVolume--
        println("Speaker volume decreased to $speakerVolume")
    }
    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber")
    }
    fun previousChannel() {
        channelNumber--
        println("Channel number decreased to $channelNumber")
    }
    override fun turnOn() {
        super.turnOn()
        println("$name turned on. Speaker volume is set to $speakerVolume and channel number is" +
                "set to $channelNumber")
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }
}