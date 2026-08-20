fun main() {
    exemplo1()
    println()
    exemplo2()
    println()
    exemplo3()
    println()
    exemplo4()
}

fun exemplo1() {
    // O laço for inicia a iteração de 1 até 10
    for (i in 1..10) {
        // Imprime o valor atual da iteraçãoo seguido por um espaço
        print("$i ")
    }
}

fun exemplo2() {
    // O laço for inicia a iteração de 1 até 10 de 2 em 2
    for (i in 1..10 step 2) {
        print("$i ")
    }
}

fun exemplo3() {
    // O laço for inicia a iteração de 10 até 0 de 2 em 2
    for (i in 10 downTo 0 step 2) {
        print("$i ")
    }
}

fun exemplo4() {
    // Uma String nada mais é que uma cadeia de caracteres
    for (c in "Curso de Kotlin") {
        print("$c ")
    }
}