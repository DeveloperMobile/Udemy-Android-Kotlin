/**
 * Assim como if/else, when tam´bem é uma  expressão e pode retorar valores.
 */
fun main() {
    acontecimentoWhen(1994)
    acontecimentoWhen(2002)
    acontecimentoWhen(2004)

    println()

    println("Soma: ${operacao2(2, 2, "Soma")}")
    println("Subtração: ${operacao2(5, 3, "Subtracao")}")
    println("Outra operação: ${operacao2(0, 0, "Divisao")}")
}

fun acontecimentoWhen(ano: Int) {
    when(ano) {
        in 0..1999 -> {
            println("Milênioo passdo")
        }
        in 2000..2003 -> {
            println("Presidente: Fernando Henrique Cardoso")
        }
        else -> {
            println("Deixemos pro futuro.")
        }
    }
}

fun operacao(a: Int, b:  Int, operacao: String): Int {
    when(operacao) {
        "Soma" -> {
            return a + b
        }
        "Subtracao" -> {
            return a - b
        }
        else -> {
            return 0
        }
    }
}

/**
 * Whhen uusada diretamente no retorno
 */
fun operacao2(a: Int, b:  Int, operacao: String): Int {
    return when(operacao) {
        "Soma" -> a + b
        "Subtracao" -> a - b
        else -> 0
    }
}