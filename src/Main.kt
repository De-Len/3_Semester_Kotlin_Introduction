fun main() {
    println("\nЗадача 1.2\n")
    println("Вводите числа. 0 - окончание:")
    while (true) {
        println("Введите новое число:")
        val newNumber : Int? = readLine()!!.toIntOrNull()
        if (newNumber == 0) {
            break
        }
    }
}