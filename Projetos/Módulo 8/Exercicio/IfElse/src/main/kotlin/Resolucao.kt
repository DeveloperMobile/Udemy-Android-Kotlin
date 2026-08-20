fun ex1() {
    print("Digite o primeiro lado: ")
    val lado1 = readln().toInt()

    print("Digite o segundo lado: ")
    val lado2 = readln().toInt()

    if (lado1 == lado2) {
        println("Os lados formam um quadrado.")
    } else {
        println("Os lados não formam um quadrado.")
    }
}

fun ex2() {
    print("Digite o primeiro lado: ")
    val lado1 = readln().toInt()

    print("Digite o segundo lado: ")
    val lado2 = readln().toInt()

    print("Digite o terceiro lado: ")
    val lado3 = readln().toInt()

    if (lado1 == lado2 && lado2 == lado3) {
        println("É um triângulo equilátero.")
    } else {
        println("Não é um triângulo equilátero.")
    }
}

fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0) {
            println("Primeira string")
        } else {
            println("Segunda string")
        }
    }
    println("Terceira string")
}

fun main() {
    ex1()
    println()
    ex2()
    println()
    qualASaida(4)
}