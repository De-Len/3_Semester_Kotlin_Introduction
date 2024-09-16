class Car (var name: String, val speed: Int) {

}

data class Vehicle (var name : String, val speed: Int) {

}

fun main() {
    val car1 = Car("Lada",100)
    val car2 = Car("Lada", 100)

    println("car1 == car2: ${car1 == car2}")
    println("car1 === car2: ${car1 === car2}")
    println("Хешкоды: ${car1.hashCode()}, ${car2.hashCode()}")

    val car3 = car1
    println("car1 == car3: ${car1 == car3}")
    println("car1 === car3: ${car1 === car3}")
    println("Хешкоды: ${car1.hashCode()}, ${car3.hashCode()}")

    car3.name = "Belaz"
    println("car1 == car3 (измененный): ${car1 == car3}")
    println("car1 === car3 (измененный): ${car1 === car3}")
    println("Хешкоды: ${car1.hashCode()}, ${car3.hashCode()}")

    val vehicle1 = Vehicle("Ural" ,100)
    val vehicle2 = Vehicle("Ural" ,100)
    println("vehicle1 == vehicle2: ${vehicle1 == vehicle2}")
    println("vehicle1 === vehicle2: ${vehicle1 === vehicle2}")
    println("Хешкоды: ${vehicle1.hashCode()}, ${vehicle2.hashCode()}")

    var vehicle3 = vehicle1
    println("vehicle1 == vehicle3: ${vehicle1 == vehicle3}")
    println("vehicle1 === vehicle3: ${vehicle1 === vehicle3}")
    println("Хешкоды: ${vehicle1.hashCode()}, ${vehicle3.hashCode()}")

    vehicle3.name = "Lada"
    println("vehicle1 == vehicle3 (измененный): ${vehicle1 == vehicle3}")
    println("vehicle1 === vehicle3 (измененный): ${vehicle1 === vehicle3}")
    println("Хешкоды: ${vehicle1.hashCode()}, ${vehicle3.hashCode()}")

    println("Copy:")
    vehicle3 = vehicle1.copy("ZIL")
    val vehicle4 = vehicle1.copy()
    println("vehicle1 == vehicle3: ${vehicle1 == vehicle3}")
    println("vehicle1 === vehicle3: ${vehicle1 === vehicle3}")
    println("Хешкоды: ${vehicle1.hashCode()}, ${vehicle3.hashCode()}")
    println("vehicle1 == vehicle4: ${vehicle1 == vehicle4}")
    println("vehicle1 === vehicle4: ${vehicle1 === vehicle4}")
    println("Хешкоды: ${vehicle1.hashCode()}, ${vehicle4.hashCode()}")
}