open class Vehicle {
    protected open val speed: Int = 0
    protected open val name: String = "Транспорт"

    fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    fun stop() {
        println("$name остановился")
    }
}

class Car : Vehicle() {
    override val speed = 50
    override val name = "Автомобиль"
}

class Plane : Vehicle() {
    override val speed = 300
    override val name = "Самолёт"
}

class Tank : Vehicle() {
    override var speed = 30
    override val name = "Танк"
}

fun main() {
    val car = Car()
    car.start()
    car.stop()
    println()
    val plane = Plane()
    plane.start()
    plane.stop()
    println()
    val tank = Tank()
    tank.start()
    tank.stop()
}