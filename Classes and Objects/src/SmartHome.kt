import kotlin.time.measureTimedValue

// HAS-A relationship

class SmartHome(
    val smartTvDevice: SmartTV,
    val smartLightDevice: SmartLightDevice
) {
    var deviceTurnOnCount = 0
        private set
    fun turnOnTV() {
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }
    fun turnOffTV() {
        if (smartTvDevice.deviceStatus == "on") {
            deviceTurnOnCount--
            smartTvDevice.turnOff()
        }
    }
    fun increaseTvVolume() {
        if (smartTvDevice.deviceStatus == "on") {
            smartTvDevice.increaseSpeakerVolume()
        }
    }
    fun decreaseRvVolume() {
        if (smartTvDevice.deviceStatus == "on") {
            smartTvDevice.decreaseSpeakerVolume()
        }
    }
    fun changeChannelToNext() {
        if (smartTvDevice.deviceStatus == "on") {
            smartTvDevice.nextChannel()
        }
    }
    fun changeChannelToPrevious() {
        if (smartTvDevice.deviceStatus == "on") {
            smartTvDevice.previousChannel()
        }
    }
    fun turnOnLight() {
            deviceTurnOnCount++
            smartLightDevice.turnOn()

    }
    fun turnOffLight() {
        if (smartTvDevice.deviceStatus == "on") {
            deviceTurnOnCount--
            smartLightDevice.turnOff()
        }
    }
    fun increaseLightBrightness() {
        if (smartLightDevice.deviceStatus == "on") {
            smartLightDevice.increaseBrightnessLevel()
        }
    }
    fun decreaseLightBrightness() {
        if (smartLightDevice.deviceStatus == "on") {
            smartLightDevice.decreaseBrightness()
        }
    }
    fun printSmartTvInfo() {
        if (smartTvDevice.deviceStatus == "on") {
            smartTvDevice.printDeviceInfo()
        }
    }
    fun printSmartLightInfo() {
        if (smartLightDevice.deviceStatus == "on") {
            smartLightDevice.printDeviceInfo()
        }
    }
    fun turnOffAllDevices() {
        if (smartTvDevice.deviceStatus=="on") {
            smartTvDevice.turnOff()
            deviceTurnOnCount--
        }
        if (smartLightDevice.deviceStatus=="on") {
            smartLightDevice.turnOff()
            deviceTurnOnCount--
        }
    }
}