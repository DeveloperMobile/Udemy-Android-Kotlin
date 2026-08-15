fun main() {
    val str = "Programação Kotlin."

    // Tamanho de uma String
    println("Tamanho: ${str.length} caracteres.")

    // Obtém uma posição
    println("Primeira letra: ${str[0]}")

    // Verifica se a String começa com o parâmetro informado
    println(str.startsWith("Programação"))

    // Verifica se a String termina com o parâmetro informado
    println(str.endsWith("."))

    // Obtém parte de uma String - Começa na posição 5 até o final
    println(str.substring(6))

    // Obtém parte de uma String - intervalo definido (começo e fim)
    println(str.substring(6, 8))

    // Substitui todas as ocorrências dentro de uma String por outra
    println(str.replace("o", "a"))

    // Converte toda a string para maiúsculas
    println(str.uppercase())

    // Converte toda a string para minúsculas
    println(str.lowercase())

    // Verifica se a String contém outra String
    println(str.contains("Kotlin"))

    // erificação de nulo ou vazio
    println(str.isEmpty())
    println(str.isNullOrEmpty())

    // Elimina espaços em braco no começo e fimm
    println("      Minha String com espaços em branco       ".trim())
}