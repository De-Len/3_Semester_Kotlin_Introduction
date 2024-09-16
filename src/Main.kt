import kotlin.random.Random

fun main() {
    val random = Random.Default
    val size = 5
    val array = Array(size) { 0 }
    for (index in 0 until size) {
        array.set(index, random.nextInt(0, 10))
    }
    println("Исходный массив: ${array.joinToString()}")

    println("Произведение элементов массива: ${array.fold (1) {accumulator, number -> accumulator * number}}")


    println("Цикл for: ")
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    for (index in 0 until size) {
        if (array[index] < min) min = array[index]
        if (array[index] > max) max = array[index]
    }
    println("Максимальный элемент: $min, Минимальный элемент $max")

    println("Цикл while: ")
    min = Int.MAX_VALUE
    max = Int.MIN_VALUE
    var index = 0
    while (index != size) {
        if (array[index] < min) min = array[index]
        else if (array[index] > max) max = array[index]
        ++index
    }
    println("Максимальный элемент: $min, Минимальный элемент $max")

    println("Функция reduce: ")
    min = Int.MAX_VALUE
    max = Int.MIN_VALUE
    min = array.reduce { accumulator, number -> if (number < accumulator) number else accumulator }
    max = array.reduce { accumulator, number -> if (number > accumulator) number else accumulator }
    println("Максимальный элемент: $min, Минимальный элемент $max")

    println("Оператор forEach: ")
    min = Int.MAX_VALUE
    max = Int.MIN_VALUE
    array.forEach { number -> if (number < min) min = number else if (number > max) max = number}
    println("Максимальный элемент: $min, Минимальный элемент $max")

    println("Функции min(), max(): ")
    min = Int.MAX_VALUE
    max = Int.MIN_VALUE
    min = array.min()
    max = array.max()
    println("Максимальный элемент: $min, Минимальный элемент $max")
}