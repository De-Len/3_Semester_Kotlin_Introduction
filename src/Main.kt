import kotlin.random.Random

class NumberArray (private val numbers : Array<Int>) {
    val sum : Int
        get() = numbers.sum()

    fun increase(): Array<Int> {
        return numbers.map { number ->
            if (isEvenNumber(number)) number * 2 else number * 3
        }.toTypedArray()
    }

    fun isEvenNumber(number: Int) : Boolean {
        return number % 2 == 0
    }

    fun max() : Int {
        return numbers.max()
    }
    fun min() : Int {
        return numbers.min()
    }
}


fun main() {
    val random = Random.Default
    val size = 5
    val array = Array(size) { 0 }
    for (index in 0 until size) {
        array.set(index, random.nextInt(0, 10))
    }
    println("Массив: ${array.joinToString()}")

    val numberArray = NumberArray(array)

    println("Увеличенный массив: ${numberArray.increase().joinToString()}")
    println("Максимальный элемент: ${numberArray.max()}")
    println("Минимальный элемент: ${numberArray.min()}")
    println("Сумма массива: ${numberArray.sum}")
}