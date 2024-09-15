import kotlin.random.Random

fun sieveOfEratosthenes(n: Int): List<Int> { //ChatGPT
    // Создаем массив, где начальное значение true указывает, что число является простым
    val isPrime = BooleanArray(n + 1) { true }
    isPrime[0] = false // 0 не простое число
    isPrime[1] = false // 1 не простое число

    for (index in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (isPrime[index]) {
            // Отмечаем все кратные числа как непростые
            for (j in index * index..n step index) {
                isPrime[j] = false
            }
        }
    }

    // Собираем все простые числа в список
    return (2..n).filter { isPrime[it] }
}

fun main() {
    println("Введите число для вычисления простых чисел:")
    val number = readLine()?.toIntOrNull() ?: return println("Пожалуйста, введите корректное число.")

    if (number < 2) {
        println("Простые числа существуют только для n >= 2")
        return
    }
    val primes = sieveOfEratosthenes(number)
    var counter: Int = 1
    for (item in primes) {
        println("$counter-ое простое число : $item")
        ++counter
    }
}
