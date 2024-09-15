import kotlin.random.Random

fun main() {
    val random = Random.Default
    val size = 5
    val array = Array(size) { 0 }
    for (index in 0 until size) {
        array.set(index, random.nextInt(0, 10))
    }
    val sortedArray = sortArray(array)

    println("Массив: " + array.joinToString())

    println("Цикл for:")
    for (index in 0 until sortedArray.size) {
        println("${index+1} элемент, больше соседних: ${sortedArray[index]}")
    }

    println("Цикл while:")
    var index = 0
    while (index != sortedArray.size) {
        println("${index+1} элемент, больше соседних: ${sortedArray[index]}")
        ++index
    }

    println("Цикл forEach:")
    sortedArray.forEach {number -> println("${sortedArray.indexOf(number) + 1} элемент, больше соседних: ${number}")}
}

fun sortArray(array : Array<Int>) : MutableList<Int> {
    val totalList : MutableList<Int> = mutableListOf()
    for (index in 1 until 4) {
        if (array[index - 1] < array[index] && array[index] > array[index + 1]) {
            totalList.add(array[index])
        }
    }
    return totalList
}