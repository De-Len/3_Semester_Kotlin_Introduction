fun main() {
    println("Задача 1.1 \n")
    print("Введите целое число: ")
    val input: Int = readln().toInt()
    val firstDigit = input % 10
    var lastDigit = input
    while (lastDigit >= 10) {
        lastDigit /= 10
    }
    println("Сумма первой и последней цифры: ${firstDigit + lastDigit}")
}
