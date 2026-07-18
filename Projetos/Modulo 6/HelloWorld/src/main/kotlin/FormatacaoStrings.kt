fun main() {
    val kotlin = "Kotlin " + "é show"
    println(kotlin)
    println()

    // Escrevendo String em linhas diferentes
    val nome = "Charles " +
            "Babbage"

    // Uso do $ para concatenar String se chama interpolaçãoo
    println("Nome é $nome")
    println("Tamanhoo do nome é de ${nome.length} caracteres.")
    println()

    val linguagem = "Kotlin"
    val caracteristicas = "e show"

    // Concatenação "manual"
    val strFinal = linguagem + " " + caracteristicas
    println(strFinal)
    println()

    // Usando recurso Kotlin para concatenação
    println("$linguagem $caracteristicas")

}