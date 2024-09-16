import kotlin.math.sqrt

class Vector(val x: Float, val y: Float, val z: Float) {
    fun length(): Float {
        return sqrt(x * x + y * y + z * z).toFloat()
    }

    infix fun multiply(other: Vector): Float {
        return this * other
    }

    operator fun times(other: Vector): Float {
        return x * other.x + y * other.y + z * other.z
    }

    override fun toString(): String {
        return "Vector(x=$x, y=$y, z=$z)"
    }
}

fun multiply(vector1: Vector, vector2: Vector): Float {
    return vector1 * vector2
}
fun main() {
    val vector1 = Vector(1.0f, 2.0f, 3.0f)
    val vector2 = Vector(4.0f, 5.0f, 6.0f)

    val result3 = vector1 * vector2

    val result2 = vector1 multiply vector2

    val result1 = multiply(vector1, vector2)

    println("Вектор 1: $vector1")
    println("Вектор 2: $vector2")
    println("Длина вектора 1: ${vector1.length()}")
    println("Длина вектора 2: ${vector2.length()}")
    println("Скалярное произведение (обычная функция): $result1")
    println("Скалярное произведение (infix функция): $result2")
    println("Скалярное произведение (оператор *): $result3")
}


