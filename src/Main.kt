import kotlin.math.sqrt

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val a = 1
    val b = -12
    val c = 35
    println("a: $a, b: $b, c : $c, корни: ${quadraticRoot(a, b, c).joinToString()}")

}

fun sqr(n : Int) : Int {
    return n * n
}

fun discriminant(a : Int, b : Int, c : Int) : Int {
    return sqr(b) - (4 * a * c)
}

fun rootsNumber(a : Int, b : Int, c : Int) : Int {
    when {
        discriminant(a, b, c) > 0 -> return 2
        discriminant(a, b, c) < 0 -> return 0
        else -> return 1
    }
}

fun quadraticRoot(a: Int, b: Int, c: Int) : MutableList<Double> {
    val list = mutableListOf<Double>()
    when (rootsNumber(a, b, c)) {
        2 -> {
            list.add((-b + sqrt(discriminant(a, b, c).toDouble())) / (2 * a))
            list.add((-b - sqrt(discriminant(a, b, c).toDouble())) / (2 * a))
        }
        1 -> list.add(-b.toDouble() / (2 * a))
    }
    return list
}