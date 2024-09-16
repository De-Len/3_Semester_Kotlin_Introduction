import kotlin.math.PI
import kotlin.math.sqrt
import kotlin.random.Random

interface Figure {
    fun area(): Double
    fun perimeter(): Double
}

class Square(private val side: Double) : Figure {
    override fun area(): Double {
        return side * side
    }

    override fun perimeter(): Double {
        return 4 * side
    }
}

class Circle(private val radius: Double) : Figure {
    override fun area(): Double {
        return PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
    }
}

class Triangle(private val a: Double, private val b: Double, private val c: Double) : Figure {
    override fun area(): Double {
        val s = perimeter() / 2
        return sqrt(s * (s - a) * (s - b) * (s - c))
    }

    override fun perimeter(): Double {
        return a + b + c
    }
}

fun main() {
    val square = Square(4.0)
    println("Квадрат:")
    println("Площадь: ${square.area()}")
    println("Периметр: ${square.perimeter()}")

    val circle = Circle(3.0)
    println("\nОкружность:")
    println("Площадь: ${circle.area()}")
    println("Периметр: ${circle.perimeter()}")

    val triangle = Triangle(3.0, 4.0, 5.0)
    println("\nТреугольник:")
    println("Площадь: ${triangle.area()}")
    println("Периметр: ${triangle.perimeter()}")
}