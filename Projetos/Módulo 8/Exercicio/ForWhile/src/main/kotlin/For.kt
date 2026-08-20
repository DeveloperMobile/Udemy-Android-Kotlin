fun main() {
    ex1()
    println()
    ex2()
    println()
    ex3()
    println()
    ex4()
}

fun ex1() {
    for (i in 1..50) {
        print("$i ")
    }
}

fun ex2() {
    for (i in 50 downTo 1) {
        print("$i ")
    }
}

fun ex3() {
    for (i in 1..50) {
       if (i % 5 == 0) {
           continue
       }
        print("$i ")
    }
}

fun ex4() {
    var soma = 0
    for (i in 1..500) {
       soma += i
    }
    print("Soma: $soma")
}