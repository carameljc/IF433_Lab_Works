package oop_105783_HannaPaulineHaryono.Week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myElectricCar = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 90)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()

    println("\n--- Testing Employee Hierarchy ---")
    val manager = Manager(name = "Budi", baseSalary = 10000000)
    manager.work()
    println("Bonus ${manager.name}: ${manager.calculateBonus()}")

    val developer = Developer(name = "Sinta", baseSalary = 8000000, programmingLanguage = "Kotlin")
    developer.work()
    println("Bonus ${developer.name}: ${developer.calculateBonus()}")
}