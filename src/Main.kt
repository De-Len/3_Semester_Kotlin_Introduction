fun main() {
    println("Введите первое число:")
    var number1 = readln().toDouble()
    println("Введите второе число:")
    var number2 = readln().toDouble()
    println("Введите операцию (+,-,* или /):")
    var operation = readln()
    when (operation) {
        "+" -> println(number1 + number2)
        "-" -> println(number1 - number2)
        "*" -> println(number1 * number2)
        "/" -> println(number1 / number2)
    }
}