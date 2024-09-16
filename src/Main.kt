fun main() {
    // Задача 1: Выделить все отрицательные элементы в новый список
    val numbers = listOf(10, -5, 30, -2, 15, -7)
    val negativeNumbers = numbers.filter { it < 0 }
    println("Отрицательные элементы: $negativeNumbers")

    // Задача 2: Изменить знак для всех положительных элементов списка
    val transformedNumbers = numbers.map { if (it > 0) -it else it }
    println("Измененные знаки: $transformedNumbers")

    // Задача 3: Сформировать новый список из квадратов
    val squaredNumbers = numbers.map { it * it }
    println("Квадраты чисел: $squaredNumbers")

    // Задача 4: Вывести список в формате “=1+2+3+4+5+6+7=”
    val rangeList = (1..7).toList()
    val resultString = rangeList.joinToString("+", prefix = "=", postfix = "=")
    println("Список: $resultString")

    // Задача 5: Оставить только пары “имя”-”номер телефона” с заданным кодом страны
    val phoneBook = mapOf(
        "Алексей" to "+79211234567",
        "Мария" to "+79161234567",
        "Петр" to "+74851234567"
    )
    val countryCode = "+79"
    val filteredPhoneBook = phoneBook.filter { it.value.startsWith(countryCode) }
    println("Телефонная книга с кодом $countryCode: $filteredPhoneBook")

    // Задача 6: Вывести число прописью
    fun numberToWords(num: Int): String {
        val units = listOf("", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять")
        val teens = listOf("десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать")
        val tens = listOf("", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто")

        if (num < 10) return units[num]
        if (num < 20) return teens[num - 10]
        return tens[num / 10] + (if (num % 10 != 0) " " + units[num % 10] else "")
    }

    println("Введите число от 0 до 100:")
    val input = readLine()!!.toInt()
    if (input in 0..100) {
        println("Число $input прописью: ${numberToWords(input)}")
    } else {
        println("Число вне диапазона.")
    }

    // Задача 7: Рассчитать количество секунд из строки времени “01:20:12”
    val timeString = "01:20:12"
    val timeParts = timeString.split(":").map { it.toInt() }
    val seconds = timeParts[0] * 3600 + timeParts[1] * 60 + timeParts[2]
    println("Количество секунд: $seconds")
}