package oop_105783_HannaPaulineHaryono.Week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("[$name] CCTV menyala.")
        startRecord() // otomatis mulai merekam saat dinyalakan
    }

    override fun turnOff() {
        println("[$name] CCTV dimatikan.")
    }

    override fun startRecord() {
        println("[$name] Mulai merekam video ke storage.")
    }
}