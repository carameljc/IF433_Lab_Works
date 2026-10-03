package oop_105783_HannaPaulineHaryono.Week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat '${device.name}' berhasil ditambahkan ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n=== Mematikan semua perangkat Switchable ===")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}