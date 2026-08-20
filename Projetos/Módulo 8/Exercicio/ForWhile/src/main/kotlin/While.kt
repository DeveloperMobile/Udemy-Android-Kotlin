fun main() {
    val capacidadeCaixa = 2000
    val volumeBalao = 7
    var numeroBaloes = 0

    while ((volumeBalao * numeroBaloes) + volumeBalao <= capacidadeCaixa) {
        numeroBaloes++
    }

    println("Cabem $numeroBaloes balões.")
    println()
    exercicio2()
    println()
    exercicio3("Meu nome é Július")
    println()
    println(exercicio4("xxooox"))
    println(exercicio4("xxxxo"))
    println(exercicio4("bdefghiji"))
    println(exercicio4("ooooxzzzz"))
}

fun exercicio2() {
    var i = 1
    while (i <= 50) {
        if (i % 15 == 0) {
            print(" BuzzFizz")
        } else if (i % 3 == 0) {
            print(" Buzz")
        } else if (i % 5 == 0) {
            print(" Fizz")
        } else {
            println(" $i")
        }
        i++
    }
}

fun exercicio3(str: String) {
    var length: Int = str.length
    while (length > 0) {
        print(str[length - 1])
        length--
    }
}

fun exercicio4(str: String): Boolean {
    val texto = str.lowercase()
    var countX = 0
    var countO = 0

    var length: Int = str.length
    while (length > 0) {
        if (str[length - 1] == 'x') {
            countX++
        }
        if (str[length - 1] == 'o') {
            countO++
        }
        length--
    }

    return (countX == countO && countO != 0)
}
