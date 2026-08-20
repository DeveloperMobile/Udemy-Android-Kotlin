/**
 * Em Kotlin, if else é uma expressão; Sendo uma expressão, ela é capaz de retornar valor.
 */
fun main() {
    println(maiorIdade4(15))
    println(maiorIdade4(26))
    println(mensalidadeCuruso("informatica"))
    println(mensalidadeCuruso("geografia"))
    println(mensalidadeCuruso("direito"))
}

fun maiorIdade2(idade: Int) {
    if (idade >= 18) {
        println("Maior de idade.")
    } else {
        println("Menor de idade.")
    }
}

fun maiorIdade3(idade: Int): String {
    return if (idade >= 18) {
        "Maior de idade."
    } else {
        "Menor de idade."
    }
}

/**
 * Retorna diretamente o resultado da expressão (true / false)
 */
fun maiorIdade4(idade: Int): Boolean {
    return (idade >= 18)
}

/**
 * Valor da mensalidade de cursos
 * informática - 500
 * geofrafia - 60
 */
fun mensalidadeCuruso(curso: String): Double {
    var mensalidade = -1.0

    if (curso == "informatica") {
        mensalidade = 500.0
    } else if (curso == "geografia") {
        mensalidade = 600.0
    }
    return mensalidade
}