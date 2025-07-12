//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val smartTvDevice = SmartDevice()
    // Call methods and properties in another function outside of class
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()

    val newSmartDevice = SmartDeviceConstructor(
        name = "Android TV",
        category = "Entertainment"
    )
    val anotherNewSmartDevice = SmartDeviceConstructor(
        name = "Second Android TV",
        category = "Entertainment",
        statusCode = 0
    )
    println(anotherNewSmartDevice.deviceStatus)

    var smartDeviceInheritance: SmartDeviceInheritance = SmartTV("Android TV", "Entertainment", deviceStatus = 0)
    smartDeviceInheritance.turnOn()
    smartDeviceInheritance = SmartLightDevice("Google Light", "Utility", deviceStatus = 0)
    smartDeviceInheritance.turnOn()

    var testTV = SmartTV(deviceName = "Test TV", deviceCategory = "Entertainment", deviceStatus = 0)
    var testLight = SmartLightDevice(deviceName = "Test Light", deviceCategory = "Utility", deviceStatus = 0)
    var smartHome: SmartHome = SmartHome(testTV, testLight)
    smartHome.turnOnTV()
    smartHome.turnOnLight()
    println(smartHome.deviceTurnOnCount)
    smartHome.decreaseRvVolume()
    smartHome.changeChannelToPrevious()
    smartHome.printSmartTvInfo()
    smartHome.printSmartLightInfo()
    smartHome.decreaseLightBrightness()
    smartHome.turnOffAllDevices()
    println(smartHome.deviceTurnOnCount)
}