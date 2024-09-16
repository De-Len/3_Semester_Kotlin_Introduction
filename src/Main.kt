fun main() {
    val size = 5
    val words = MutableList<String?>(size) { null }

    for (index in 0 until size) {
        if (index == 3) words[index] = null
        else words[index] = "Слово $index"
    }
    println("Проверка на null через if")
    words.forEach{ word -> if (word != null) println(word) }

    println("Проверка на null через оператор безопасного вызова (?) и let")
    words.forEach{ word -> word?.let { println(word) } }

    println("Проверка на null, используя Элвис-оператор")
    words.forEach{ word -> println(word ?: "empty") }
}