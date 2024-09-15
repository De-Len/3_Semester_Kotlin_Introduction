import kotlin.random.Random

fun main() {
    // 3 пункт
    println("\nЗадача 1.3\n")
    println("Отгадай число (от 0 до 9)!")
    val random = Random.Default
    val secretNumber: Int = random.nextInt(0, 10)
    var guessedNumber: Int? = null

    while (guessedNumber != secretNumber) {
        println("Введите ваше число:")
        guessedNumber = readLine()?.toIntOrNull()

        if (guessedNumber == null) {
            println("Пожалуйста, введите корректное целое число.")
        } else if (guessedNumber < 0 || guessedNumber > 10) {
            println("Число должно быть в пределах от 0 до 10.")
        } else if (guessedNumber < secretNumber) {
            println("Загаданное число больше!")
        } else if (guessedNumber > secretNumber) {
            println("Загаданное число меньше!")
        } else {
            println("Поздравляем, вы угадали число!")
        }
    }
}