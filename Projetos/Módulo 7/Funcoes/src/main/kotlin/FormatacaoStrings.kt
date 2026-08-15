import java.util.Locale

fun main() {
    // Concatenação de Strings
    val nome  = "John"
    println("Olá, $nome")

    // No entanto, é possível utilizar formatação de String para evitar concatenação.
    println("Olá, %s".format(nome))

    // Tipos de dados e especificadores
    // %s - String
    // %d - Integer
    // %f - Ponto Flutuante
    // %c - Character
    // %b - Boolean

    val valor = 5
    val salarioi = 8451.54f

    println("Valor eh de %d e salário eh de %f".format(valor, salarioi))
    println()

    // Formatado numeros corretamete
    println("Valor eh de %02d e salário eh de %.2f".format(valor, salarioi))
    println()

    // Garantindo que o formato décimal use ponto (.) e não vírgula (,)
    println("Valor eh de %02d e salário eh de %.2f".format(Locale.US, valor, salarioi))
}