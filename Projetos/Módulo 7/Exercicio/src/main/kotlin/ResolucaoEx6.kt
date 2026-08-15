/**
 * Substitui todas as ocorrências da letra 'a' por 'x' em uma String fornecida
 * A String é convertida para minusculas antes da substituição
 */
fun trocarLetras(str: String) {
    // Converte a String para minúsculas e substitui 'a' por 'x'
    println(str.lowercase().replace("a", "x"))
}

/**
 * Solicita ao usuário que insira um texto, lê a entrada e a processa usando a função trocaLetras.
 * Caso a entrada seja nula. converte para uma String vazia para evitar exceções.
 */
fun letString() {
    print("Informe um texto: ")
    // Lê a entrada do usuário
    val texto = readln()
    trocarLetras(texto.toString())
}

/**
 * Ponto de entrada
 */
fun main() {
    letString()
}

