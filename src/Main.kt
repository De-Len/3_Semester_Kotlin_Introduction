class NumberArray(private val numbers: Array<Double>) {

    fun sumOfPositive(): Double {
        return numbers.filter { it > 0 }.sum()
    }

    fun product(): Double {
        return numbers.fold(1.0) { acc, num -> acc * num }
    }

    fun average(): Double {
        return if (numbers.isNotEmpty()) numbers.average() else 0.0
    }
}

fun main() {
    val array = arrayOf(1.5, -2.0, 3.0, 4.5, -1.0)
    val numberArray = NumberArray(array)

    println("Сумма положительных элементов: ${numberArray.sumOfPositive()}")
    println("Произведение элементов массива: ${numberArray.product()}")
    println("Среднее арифметическое элементов массива: ${numberArray.average()}")
}